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
public class EksStatus {

    private String managedLaunchTemplateID;
    private String managedLaunchTemplateVersions;
    private String privateRequiresTunnel;
    private String securityGroups;
    private String subnets;
    private String type;
    private String upstreamSpec;
    private String virtualNetwork;

    public void setManagedLaunchTemplateID(String managedLaunchTemplateID) {
        this.managedLaunchTemplateID = managedLaunchTemplateID;
    }

    public String getManagedLaunchTemplateID() {
        return managedLaunchTemplateID;
    }

    public void setManagedLaunchTemplateVersions(String managedLaunchTemplateVersions) {
        this.managedLaunchTemplateVersions = managedLaunchTemplateVersions;
    }

    public String getManagedLaunchTemplateVersions() {
        return managedLaunchTemplateVersions;
    }

    public void setPrivateRequiresTunnel(String privateRequiresTunnel) {
        this.privateRequiresTunnel = privateRequiresTunnel;
    }

    public String getPrivateRequiresTunnel() {
        return privateRequiresTunnel;
    }

    public void setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
    }

    public String getSecurityGroups() {
        return securityGroups;
    }

    public void setSubnets(String subnets) {
        this.subnets = subnets;
    }

    public String getSubnets() {
        return subnets;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setUpstreamSpec(String upstreamSpec) {
        this.upstreamSpec = upstreamSpec;
    }

    public String getUpstreamSpec() {
        return upstreamSpec;
    }

    public void setVirtualNetwork(String virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
    }

    public String getVirtualNetwork() {
        return virtualNetwork;
    }

}