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
public class RancherKubernetesEngineConfig {

    private int addonJobTimeout;
    private Authentication authentication;
    private Authorization authorization;
    private BastionHost bastionHost;
    private CloudProvider cloudProvider;
    private Dns dns;
    private boolean ignoreDockerVersion;
    private Ingress ingress;
    private String kubernetesVersion;
    private Monitoring monitoring;
    private Network network;
    private List<Node> nodes;
    private Restore restore;
    private boolean rotateEncryptionKey;
    private Services services;
    private boolean sshAgentAuth;
    private String type;
    private UpgradeStrategy upgradeStrategy;

    public void setAddonJobTimeout(int addonJobTimeout) {
        this.addonJobTimeout = addonJobTimeout;
    }

    public int getAddonJobTimeout() {
        return addonJobTimeout;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setBastionHost(BastionHost bastionHost) {
        this.bastionHost = bastionHost;
    }

    public BastionHost getBastionHost() {
        return bastionHost;
    }

    public void setCloudProvider(CloudProvider cloudProvider) {
        this.cloudProvider = cloudProvider;
    }

    public CloudProvider getCloudProvider() {
        return cloudProvider;
    }

    public void setDns(Dns dns) {
        this.dns = dns;
    }

    public Dns getDns() {
        return dns;
    }

    public void setIgnoreDockerVersion(boolean ignoreDockerVersion) {
        this.ignoreDockerVersion = ignoreDockerVersion;
    }

    public boolean getIgnoreDockerVersion() {
        return ignoreDockerVersion;
    }

    public void setIngress(Ingress ingress) {
        this.ingress = ingress;
    }

    public Ingress getIngress() {
        return ingress;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }

    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    public Monitoring getMonitoring() {
        return monitoring;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Network getNetwork() {
        return network;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void setRestore(Restore restore) {
        this.restore = restore;
    }

    public Restore getRestore() {
        return restore;
    }

    public void setRotateEncryptionKey(boolean rotateEncryptionKey) {
        this.rotateEncryptionKey = rotateEncryptionKey;
    }

    public boolean getRotateEncryptionKey() {
        return rotateEncryptionKey;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Services getServices() {
        return services;
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

    public void setUpgradeStrategy(UpgradeStrategy upgradeStrategy) {
        this.upgradeStrategy = upgradeStrategy;
    }

    public UpgradeStrategy getUpgradeStrategy() {
        return upgradeStrategy;
    }

}