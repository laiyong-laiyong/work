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
public class Network {

    private int mtu;
    private Options options;
    private String plugin;
    private String type;

    public void setMtu(int mtu) {
        this.mtu = mtu;
    }

    public int getMtu() {
        return mtu;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Options getOptions() {
        return options;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}