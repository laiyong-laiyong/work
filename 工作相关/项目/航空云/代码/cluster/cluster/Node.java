package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import java.util.List;

/**
 * @author 赖勇
 * @create 2022/1/14 9:45
 */
public class Node {
    private String address;
    private String hostnameOverride;
    private String nodeId;
    private String port;
    private List<String> role;
    private boolean sshAgentAuth;
    private String type;
    private String user;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHostnameOverride() {
        return hostnameOverride;
    }

    public void setHostnameOverride(String hostnameOverride) {
        this.hostnameOverride = hostnameOverride;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public boolean isSshAgentAuth() {
        return sshAgentAuth;
    }

    public void setSshAgentAuth(boolean sshAgentAuth) {
        this.sshAgentAuth = sshAgentAuth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
