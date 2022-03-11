## 部署k8s多节点集群（Kubeadm方式）

|    角色    |      IP       |
| :--------: | :-----------: |
| k8s-master | 172.16.133.10 |
| k8s-node01 | 172.16.133.20 |
| k8s-node02 | 172.16.133.30 |

Kubernetes版本：1.18.0

Centos版本：CentOS Linux release 7.6.1810 (Core)

Docker版本：18.06.1-ce

虚拟机要求：至少两核

### 一、系统初始化

#### 1、关闭防火墙

```shell
#临时关闭
systemctl stop firewalld

#永久关闭服务
systemctl disable firewalld
```

#### 2、关闭selinux

```shell
#临时关闭
setenforce 0

#永久关闭
sed -i 's/enforcing/disabled/' /etc/selinux/config
```

#### 3、关闭swap

```shell
#临时
swapoff -a

#永久
#
# /etc/fstab
# Created by anaconda on Sat Jan 22 03:24:43 2022
#
# Accessible filesystems, by reference, are maintained under '/dev/disk'
# See man pages fstab(5), findfs(8), mount(8) and/or blkid(8) for more info
#
/dev/mapper/centos-root /                       xfs     defaults        0 0
UUID=ebb8d177-8006-4a74-848c-6e464831a0d7 /boot                   xfs     defaults        0 0
/dev/mapper/centos-home /home                   xfs     defaults        0 0
# /dev/mapper/centos-swap swap                    swap    defaults        0 0  #注释掉swap分区交换的这一行
```

#### 4、设置主机名

```shell
hostnamectl set-hostname <hostname>
# 三个节点的hostname设置如下
# hostnamectl set-hostname k8s-master-binary
# hostnamectl set-hostname k8s-node01-binary
# hostnamectl set-hostname k8s-node02-binary
```

#### 5、在master添加hosts

```shell
cat >> /etc/hosts << EOF
172.16.133.100 k8s-master-binary
172.16.133.110 k8s-node01-binary
172.16.133.120 k8s-node02-binary
EOF
```

#### 6、将桥接的IPv4流量传递到iptables的链

```shell
cat > /etc/sysctl.d/k8s.conf << EOF
net.bridge.bridge-nf-call-ip6tables = 1
net.bridge.bridge-nf-call-iptables = 1
EOF

#生效
sysctl --system
```

#### 7、时间同步

```shell
yum install ntpdate -y
ntpdate time.windows.com
```

#### 8、centos系统内核升级

```shell
rpm -Uvh http://www.elrepo.org/elrepo-release-7.0-3.el7.elrepo.noarch.rpm
yum --enablerepo=elrepo-kernel install -y kernel-lt
grub2-set-default 'CentOS Linux (5.4.177-1.el7.elrepo.x86_64) 7 (Core)'
reboot
```

### 二、所有节点安装Docker/kubeadm/kubelet/kubectl

Kubernetes默认CRI（运行时容器）为Docker，因此需要安装Docker

#### 1、安装Docker

```shell
# 安装wget
yum install -y wget

# 获取阿里云docker云镜像
wget https://mirrors.aliyun.com/docker-ce/linux/centos/docker-ce.repo -O /etc/yum.repos.d/docker-ce.repo

#安装
yum -y install docker-ce-18.06.1.ce-3.el7

#启动docker并设置为开机自启
systemctl enable docker && systemctl start docker

#查看版本
docker --version
```

#### 2、添加阿里云yum软件源

```shell
#设置仓库地址
cat > /etc/docker/daemon.json << EOF
{
	"registry-mirrors": ["https://b9pmyelo.mirror.aliyuncs.com"]
}
EOF

#添加yum源
cat > /etc/yum.repos.d/kubernetes.repo << EOF
[kubernetes] 
name=Kubernetes
baseurl=https://mirrors.aliyun.com/kubernetes/yum/repos/kubernetes-el7-x86_64
enabled=1 
gpgcheck=0 
repo_gpgcheck=0 
gpgkey=https://mirrors.aliyun.com/kubernetes/yum/doc/yum-key.gpg https://mirrors.aliyun.com/kubernetes/yum/doc/rpm-package-key.gpg
EOF
```

#### 3、安装kubeadm、kubelet、kubectl

```shell
#安装
yum install kubeadm-1.18.0 kubelet-1.18.0 kubectl-1.18.0 -y

#设置为开机自启
systemctl enable kubelet
```

### 三、部署Kubernetes Master

在master节点上执行如下指令：

```shell
#节点初始化
kubeadm init --apiserver-advertise-address=172.16.133.10 --image-repository registry.aliyuncs.com/google_containers --kubernetes-version v1.18.0 --service-cidr=10.96.0.0/12 --pod-network-cidr=10.244.0.0/16
```

由于默认拉取镜像地址 k8s.gcr.io 国内无法访问，这里指定阿里云镜像仓库地址。

使用kubectl工具

```shell
#该命令在执行完节点初始化后，会出现在提示信息中，直接执行即可
mkdir -p $HOME/.kube
sudo cp -i /etc/kubernetes/admin.conf $HOME/.kube/config
sudo chown $(id -u):$(id -g) $HOME/.kube/config

#查看节点状态
kubectl get nodes
```

### 五、非master节点加入集群

master节点部署完成后会显示类似如下指令，用于非master节点加入集群：

```shell
kubeadm join 172.16.133.10:6443 --token w2923g.tqsevekg3c4vwdrd \
    --discovery-token-ca-cert-hash sha256:c3921d11b0fe7740cd056b9dfb83ae9686e9b3ebcde0f84d528d099d2ede73a3
```

在node01、node02分别执行上述指令，即可使节点加入集群。

默认token有效期为24小时，当过期之后，该token就不可用了。这时就需要创建新的token

```shell
kubeadm token create --print-join-command
```

在两个节点执行加入集群命令，此时节点为NotReady，需要安装一个pod网络插件

### 六、安装Pod网络插件

在主节点上执行如下指令：

```shell
kubectl apply -f https://raw.githubusercontent.com/coreos/flannel/master/Documentation/kube-flannel.yml
```

安装成功后，查看nodes状态，从NotReady变为Ready（需要等待一段时间）

```shell
kubectl get nodes
```

### 七、测试Kubernetes集群

在Kubernets集群创建一个pod，验证是否正常运行

```shell
#创建
kubectl create deployment nginx --image=nginx
#端口映射
kubectl expose deployment nginx --port=80 --type=NodePort
#查看
kubectl get pod
```

