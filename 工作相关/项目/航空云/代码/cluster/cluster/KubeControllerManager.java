package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

/**
 * @author 赖勇
 * @create 2022/1/14 10:22
 */
public class KubeControllerManager {
    private String expirationDate;
    private String type;

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
