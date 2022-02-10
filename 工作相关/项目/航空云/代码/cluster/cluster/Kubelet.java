/**
 * Copyright 2022 bejson.com
 */
package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import java.util.Map;

/**
 * Auto-generated: 2022-01-13 20:0:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Kubelet {

    private String clusterDnsServer;
    private String clusterDomain;
    private Map<String, String> extraArgs;
    private boolean failSwapOn;
    private boolean generateServingCertificate;
    private String type;

    public void setClusterDnsServer(String clusterDnsServer) {
        this.clusterDnsServer = clusterDnsServer;
    }

    public String getClusterDnsServer() {
        return clusterDnsServer;
    }

    public void setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
    }

    public String getClusterDomain() {
        return clusterDomain;
    }

    public void setExtraArgs(Map<String, String> extraArgs) {
        this.extraArgs = extraArgs;
    }

    public Map<String, String> getExtraArgs() {
        return extraArgs;
    }

    public void setFailSwapOn(boolean failSwapOn) {
        this.failSwapOn = failSwapOn;
    }

    public boolean getFailSwapOn() {
        return failSwapOn;
    }

    public void setGenerateServingCertificate(boolean generateServingCertificate) {
        this.generateServingCertificate = generateServingCertificate;
    }

    public boolean getGenerateServingCertificate() {
        return generateServingCertificate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}