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
public class UpgradeStrategy {

    private boolean drain;
    private String maxUnavailableControlplane;
    private String maxUnavailableWorker;
    private NodeDrainInput nodeDrainInput;
    private String type;

    public void setDrain(boolean drain) {
        this.drain = drain;
    }

    public boolean getDrain() {
        return drain;
    }

    public void setMaxUnavailableControlplane(String maxUnavailableControlplane) {
        this.maxUnavailableControlplane = maxUnavailableControlplane;
    }

    public String getMaxUnavailableControlplane() {
        return maxUnavailableControlplane;
    }

    public void setMaxUnavailableWorker(String maxUnavailableWorker) {
        this.maxUnavailableWorker = maxUnavailableWorker;
    }

    public String getMaxUnavailableWorker() {
        return maxUnavailableWorker;
    }

    public NodeDrainInput getNodeDrainInput() {
        return nodeDrainInput;
    }

    public void setNodeDrainInput(NodeDrainInput nodeDrainInput) {
        this.nodeDrainInput = nodeDrainInput;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}