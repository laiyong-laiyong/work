package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

/**
 * @author 赖勇
 * @create 2022/2/9 9:50
 */
public class NetworkInfo {
    private String networkMode;

    private String serviceForwardingMode;

    private String clusterCidr;

    private String serviceClusterIpRange;

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public String getServiceForwardingMode() {
        return serviceForwardingMode;
    }

    public void setServiceForwardingMode(String serviceForwardingMode) {
        this.serviceForwardingMode = serviceForwardingMode;
    }

    public String getClusterCidr() {
        return clusterCidr;
    }

    public void setClusterCidr(String clusterCidr) {
        this.clusterCidr = clusterCidr;
    }

    public String getServiceClusterIpRange() {
        return serviceClusterIpRange;
    }

    public void setServiceClusterIpRange(String serviceClusterIpRange) {
        this.serviceClusterIpRange = serviceClusterIpRange;
    }
}
