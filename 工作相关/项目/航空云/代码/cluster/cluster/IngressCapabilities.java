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
public class IngressCapabilities {

    private boolean customDefaultBackend;
    private String ingressProvider;
    private String type;

    public void setCustomDefaultBackend(boolean customDefaultBackend) {
        this.customDefaultBackend = customDefaultBackend;
    }

    public boolean getCustomDefaultBackend() {
        return customDefaultBackend;
    }

    public void setIngressProvider(String ingressProvider) {
        this.ingressProvider = ingressProvider;
    }

    public String getIngressProvider() {
        return ingressProvider;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}