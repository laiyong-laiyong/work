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
public class Dns {

    private Nodelocal nodelocal;
    private String provider;
    private String type;
    private List<String> upstreamnameservers;

    public Nodelocal getNodelocal() {
        return nodelocal;
    }

    public void setNodelocal(Nodelocal nodelocal) {
        this.nodelocal = nodelocal;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setUpstreamnameservers(List<String> upstreamnameservers) {
        this.upstreamnameservers = upstreamnameservers;
    }

    public List<String> getUpstreamnameservers() {
        return upstreamnameservers;
    }

}