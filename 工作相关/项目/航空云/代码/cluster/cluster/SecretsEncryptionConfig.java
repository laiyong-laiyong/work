package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

/**
 * @author 赖勇
 * @create 2022/1/14 9:50
 */
public class SecretsEncryptionConfig {
    private boolean enabled;
    private String type;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
