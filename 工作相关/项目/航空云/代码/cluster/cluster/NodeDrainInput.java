package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

/**
 * @author 赖勇
 * @create 2022/1/14 9:36
 */
public class NodeDrainInput {
    private boolean deleteLocalData;
    private boolean force;
    private int gracePeriod;
    private boolean ignoreDaemonSets;
    private int timeout;
    private String type;

    public boolean isDeleteLocalData() {
        return deleteLocalData;
    }

    public void setDeleteLocalData(boolean deleteLocalData) {
        this.deleteLocalData = deleteLocalData;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public boolean isIgnoreDaemonSets() {
        return ignoreDaemonSets;
    }

    public void setIgnoreDaemonSets(boolean ignoreDaemonSets) {
        this.ignoreDaemonSets = ignoreDaemonSets;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
