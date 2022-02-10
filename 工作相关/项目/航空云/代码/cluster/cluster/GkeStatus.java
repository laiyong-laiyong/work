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
public class GkeStatus {

    private String privateRequiresTunnel;
    private String type;
    private String upstreamSpec;

    public void setPrivateRequiresTunnel(String privateRequiresTunnel) {
        this.privateRequiresTunnel = privateRequiresTunnel;
    }

    public String getPrivateRequiresTunnel() {
        return privateRequiresTunnel;
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

}