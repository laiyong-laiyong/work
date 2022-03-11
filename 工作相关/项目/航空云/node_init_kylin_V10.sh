#!/bin/bash

USERID=$(id -u)
if [ "$USERID" != "0" ]; then
	echo "[ERROR] USERID != 0"
	exit 1
fi

# hostName=$1
# hostIP=$2

# if [ -n "$hostName" -a "$hostIP" ]; then
	# hostnamectl set-hostname $hostName
	# echo "$hostIP  $hostName" >> /etc/hosts
# fi

systemctl stop firewalld.service
systemctl disable firewalld.service

setenforce 0
sed -i 's/^SELINUX=enforcing/SELINUX=disabled/g' /etc/selinux/config
sed -i 's/^SELINUX=permissive/SELINUX=disabled/g' /etc/selinux/config

swapoff -a
sed -i 's/^[^#].* swap /#&/' /etc/fstab

yum install -y chrony
######################


echo "
net.bridge.bridge-nf-call-ip6tables=1
net.bridge.bridge-nf-call-iptables=1
net.ipv4.ip_forward=1
net.ipv4.conf.all.forwarding=1
net.ipv4.neigh.default.gc_thresh1=4096
net.ipv4.neigh.default.gc_thresh2=6144
net.ipv4.neigh.default.gc_thresh3=8192
net.ipv4.neigh.default.gc_interval=60
net.ipv4.neigh.default.gc_stale_time=120

kernel.perf_event_paranoid=-1

net.ipv4.tcp_slow_start_after_idle=0
fs.inotify.max_user_watches=524288
fs.file-max=2097152
fs.inotify.max_user_instances=8192
fs.inotify.max_queued_events=16384

kernel.softlockup_all_cpu_backtrace=1
kernel.softlockup_panic=1

vm.max_map_count=262144
net.core.netdev_max_backlog=16384

net.ipv4.tcp_wmem=4096 12582912 16777216
net.core.wmem_max=16777216
net.ipv4.tcp_rmem=4096 12582912 16777216
net.core.rmem_max=16777216

net.core.somaxconn=32768

net.ipv4.tcp_max_syn_backlog=8192

net.ipv6.conf.all.disable_ipv6=1
net.ipv6.conf.default.disable_ipv6=1
net.ipv6.conf.lo.disable_ipv6=1

#kernel.yama.ptrace_scope=0

vm.swappiness=0

kernel.core_uses_pid=1

net.ipv4.conf.default.accept_source_route=0
net.ipv4.conf.all.accept_source_route=0
net.ipv4.conf.default.promote_secondaries=1
net.ipv4.conf.all.promote_secondaries=1

fs.protected_hardlinks=1
fs.protected_symlinks=1

net.ipv4.conf.all.rp_filter=0
net.ipv4.conf.default.rp_filter=0

net.ipv4.conf.default.arp_announce=2
net.ipv4.conf.lo.arp_announce=2
net.ipv4.conf.all.arp_announce=2

net.ipv4.tcp_max_tw_buckets=5000

net.ipv4.tcp_fin_timeout=30

net.ipv4.tcp_synack_retries=2

kernel.sysrq=1
" >> /etc/sysctl.conf
sysctl -p /etc/sysctl.conf

echo 30 > /proc/sys/kernel/watchdog_thresh

cat >> /etc/security/limits.conf <<EOF
* soft nofile 65535
* hard nofile 65536
EOF

cat >/etc/sysconfig/modules/k8s.modules <<EOF
modprobe br_netfilter
modprobe udp_tunnel
modprobe ip6_udp_tunnel
modprobe ip_set
modprobe ip_set_hash_ip
modprobe ip_set_hash_net
modprobe iptable_filter
modprobe iptable_nat
modprobe iptable_mangle
modprobe iptable_raw
modprobe nf_conntrack_netlink
modprobe nf_conntrack
modprobe nf_defrag_ipv4
modprobe nf_nat
modprobe nfnetlink
modprobe x_tables
modprobe xt_addrtype
modprobe xt_conntrack
modprobe xt_comment
modprobe xt_mark
modprobe xt_multiport
modprobe xt_nat
modprobe xt_recent
modprobe xt_set
modprobe xt_statistic
modprobe xt_tcpudp
modprobe veth
modprobe vxlan
modprobe macvlan
EOF

chmod +x /etc/sysconfig/modules/k8s.modules
source /etc/sysconfig/modules/k8s.modules

yum install -y wget
systemctl stop docker 2>/dev/null
for i in {1..3}; do
	wget -O /tmp/docker-20.10.12.tgz https://download.docker.com/linux/static/stable/aarch64/docker-20.10.12.tgz
	MD5=$(md5sum /tmp/docker-20.10.12.tgz | awk '{print $1}')
	if [ "$MD5" = "0bbdde854f92d48628f0fa9ccf02af1e" ]; then
		rm -rf /tmp/docker
		tar -xf /tmp/docker-20.10.12.tgz -C /tmp/
		chmod +x /tmp/docker/*
		scp /tmp/docker/* /usr/bin
		rm -rf /tmp/docker*
		break
	fi
	if [ "$i" = "3" ]; then
		echo "[ERROR] exec failed: wget -O /tmp/docker-20.10.12.tgz https://download.docker.com/linux/static/stable/aarch64/docker-20.10.12.tg"
		exit 1
	fi
done

mkdir -p /etc/docker/
cat >/etc/docker/daemon.json <<EOF
{
  "data-root": "/var/lib/docker",
  "storage-driver": "overlay2",
  "max-concurrent-uploads": 10,
  "max-concurrent-downloads": 10,
  "insecure-registries": [
    "0.0.0.0/0"
  ],
  "bip": "10.88.0.1/24",
  "default-address-pools": [
    {
      "base": "10.66.0.0/16",
      "size": 24
    }
  ],
  "log-driver": "json-file",
  "log-level": "info",
  "log-opts": {
    "max-size": "50m",
    "max-file": "10"
  }
}
EOF

mkdir -p /usr/lib/systemd/system/
cat >/usr/lib/systemd/system/docker.service <<EOF
[Unit]
Description=Docker Application Container Engine
Documentation=https://docs.docker.com
After=network-online.target
Wants=network-online.target

[Service]
Type=notify
EnvironmentFile=/etc/docker/daemon.json
ExecStart=/usr/bin/dockerd
ExecStartPost=/bin/chown root:root /var/run/docker.sock
ExecReload=/bin/kill -s HUP $MAINPID
TimeoutSec=0
RestartSec=30
Restart=always
StartLimitBurst=3
StartLimitInterval=120s
LimitNOFILE=infinity
LimitNPROC=infinity
LimitCORE=infinity
KillMode=process
OOMScoreAdjust=-500

[Install]
WantedBy=multi-user.target
EOF

systemctl daemon-reload
systemctl start docker
systemctl enable docker

