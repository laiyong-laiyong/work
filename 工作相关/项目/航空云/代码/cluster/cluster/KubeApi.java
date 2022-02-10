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
public class KubeApi {

    private boolean alwaysPullImages;
    private boolean podSecurityPolicy;
    private SecretsEncryptionConfig secretsEncryptionConfig;
    private String serviceClusterIpRange;
    private String serviceNodePortRange;
    private String type;

    public void setAlwaysPullImages(boolean alwaysPullImages) {
        this.alwaysPullImages = alwaysPullImages;
    }

    public boolean getAlwaysPullImages() {
        return alwaysPullImages;
    }

    public void setPodSecurityPolicy(boolean podSecurityPolicy) {
        this.podSecurityPolicy = podSecurityPolicy;
    }

    public boolean getPodSecurityPolicy() {
        return podSecurityPolicy;
    }

    public SecretsEncryptionConfig getSecretsEncryptionConfig() {
        return secretsEncryptionConfig;
    }

    public void setSecretsEncryptionConfig(SecretsEncryptionConfig secretsEncryptionConfig) {
        this.secretsEncryptionConfig = secretsEncryptionConfig;
    }

    public void setServiceClusterIpRange(String serviceClusterIpRange) {
        this.serviceClusterIpRange = serviceClusterIpRange;
    }

    public String getServiceClusterIpRange() {
        return serviceClusterIpRange;
    }

    public void setServiceNodePortRange(String serviceNodePortRange) {
        this.serviceNodePortRange = serviceNodePortRange;
    }

    public String getServiceNodePortRange() {
        return serviceNodePortRange;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}