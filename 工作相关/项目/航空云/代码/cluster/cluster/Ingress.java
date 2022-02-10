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
public class Ingress {

    private boolean defaultBackend;
    private int httpPort;
    private int httpsPort;
    private String provider;
    private String type;

    public void setDefaultBackend(boolean defaultBackend) {
        this.defaultBackend = defaultBackend;
    }

    public boolean getDefaultBackend() {
        return defaultBackend;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public void setHttpsPort(int httpsPort) {
        this.httpsPort = httpsPort;
    }

    public int getHttpsPort() {
        return httpsPort;
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

}