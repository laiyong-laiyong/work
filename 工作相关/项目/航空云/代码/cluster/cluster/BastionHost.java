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
public class BastionHost {

    private boolean sshAgentAuth;
    private String type;

    public void setSshAgentAuth(boolean sshAgentAuth) {
        this.sshAgentAuth = sshAgentAuth;
    }

    public boolean getSshAgentAuth() {
        return sshAgentAuth;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}