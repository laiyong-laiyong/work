/**
 * Copyright 2022 bejson.com
 */
package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import java.util.List;

/**
 * Auto-generated: 2022-01-13 20:0:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Capabilities {

    private List<IngressCapabilities> ingressCapabilities;
    private LoadBalancerCapabilities loadBalancerCapabilities;
    private boolean nodePoolScalingSupported;
    private String nodePortRange;
    private boolean pspEnabled;
    private boolean taintSupport;
    private String type;

    public void setIngressCapabilities(List<IngressCapabilities> ingressCapabilities) {
        this.ingressCapabilities = ingressCapabilities;
    }

    public List<IngressCapabilities> getIngressCapabilities() {
        return ingressCapabilities;
    }

    public void setLoadBalancerCapabilities(LoadBalancerCapabilities loadBalancerCapabilities) {
        this.loadBalancerCapabilities = loadBalancerCapabilities;
    }

    public LoadBalancerCapabilities getLoadBalancerCapabilities() {
        return loadBalancerCapabilities;
    }

    public void setNodePoolScalingSupported(boolean nodePoolScalingSupported) {
        this.nodePoolScalingSupported = nodePoolScalingSupported;
    }

    public boolean getNodePoolScalingSupported() {
        return nodePoolScalingSupported;
    }

    public void setNodePortRange(String nodePortRange) {
        this.nodePortRange = nodePortRange;
    }

    public String getNodePortRange() {
        return nodePortRange;
    }

    public void setPspEnabled(boolean pspEnabled) {
        this.pspEnabled = pspEnabled;
    }

    public boolean getPspEnabled() {
        return pspEnabled;
    }

    public void setTaintSupport(boolean taintSupport) {
        this.taintSupport = taintSupport;
    }

    public boolean getTaintSupport() {
        return taintSupport;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}