/**
 * Copyright 2022 bejson.com
 */
package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import java.util.List;
import java.util.Map;

/**
 * Auto-generated: 2022-01-13 20:0:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Etcd {

    private BackupConfig backupConfig;
    private String creation;
    private Map<String, String> extraArgs;
    private List<String> extraBinds;
    private int gid;
    private String retention;
    private boolean snapshot;
    private String type;
    private int uid;

    public void setBackupConfig(BackupConfig backupConfig) {
        this.backupConfig = backupConfig;
    }

    public BackupConfig getBackupConfig() {
        return backupConfig;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }

    public String getCreation() {
        return creation;
    }

    public void setExtraArgs(Map<String, String> extraArgs) {
        this.extraArgs = extraArgs;
    }

    public Map<String, String> getExtraArgs() {
        return extraArgs;
    }

    public void setExtraBinds(List<String> extraBinds) {
        this.extraBinds = extraBinds;
    }

    public List<String> getExtraBinds() {
        return extraBinds;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGid() {
        return gid;
    }

    public void setRetention(String retention) {
        this.retention = retention;
    }

    public String getRetention() {
        return retention;
    }

    public void setSnapshot(boolean snapshot) {
        this.snapshot = snapshot;
    }

    public boolean getSnapshot() {
        return snapshot;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

}