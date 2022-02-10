/**
 * Copyright 2022 bejson.com
 */
package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

/**
 * Auto-generated: 2022-01-13 20:0:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class KubeController {

    private String clusterCidr;
    private String serviceClusterIpRange;
    private String type;

    public void setClusterCidr(String clusterCidr) {
        this.clusterCidr = clusterCidr;
    }

    public String getClusterCidr() {
        return clusterCidr;
    }

    public void setServiceClusterIpRange(String serviceClusterIpRange) {
        this.serviceClusterIpRange = serviceClusterIpRange;
    }

    public String getServiceClusterIpRange() {
        return serviceClusterIpRange;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}