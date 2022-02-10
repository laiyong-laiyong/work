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
public class Nodes {

    private String address;
    private String hostnameOverride;
    private String internalAddress;
    private String nodeId;
    private String port;
    private List<String> role;
    private boolean sshAgentAuth;
    private String type;
    private String user;
    public void setAddress(String address) {
         this.address = address;
     }
     public String getAddress() {
         return address;
     }

    public void setHostnameOverride(String hostnameOverride) {
         this.hostnameOverride = hostnameOverride;
     }
     public String getHostnameOverride() {
         return hostnameOverride;
     }

    public void setInternalAddress(String internalAddress) {
         this.internalAddress = internalAddress;
     }
     public String getInternalAddress() {
         return internalAddress;
     }

    public void setNodeId(String nodeId) {
         this.nodeId = nodeId;
     }
     public String getNodeId() {
         return nodeId;
     }

    public void setPort(String port) {
         this.port = port;
     }
     public String getPort() {
         return port;
     }

    public void setRole(List<String> role) {
         this.role = role;
     }
     public List<String> getRole() {
         return role;
     }

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

    public void setUser(String user) {
         this.user = user;
     }
     public String getUser() {
         return user;
     }

}