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
public class BackupConfig {

    private boolean enabled;
    private int intervalHours;
    private int retention;
    private String s3BackupConfig;
    private boolean safeTimestamp;
    private int timeout;
    private String type;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setIntervalHours(int intervalHours) {
        this.intervalHours = intervalHours;
    }

    public int getIntervalHours() {
        return intervalHours;
    }

    public void setRetention(int retention) {
        this.retention = retention;
    }

    public int getRetention() {
        return retention;
    }

    public void setS3BackupConfig(String s3BackupConfig) {
        this.s3BackupConfig = s3BackupConfig;
    }

    public String getS3BackupConfig() {
        return s3BackupConfig;
    }

    public void setSafeTimestamp(boolean safeTimestamp) {
        this.safeTimestamp = safeTimestamp;
    }

    public boolean getSafeTimestamp() {
        return safeTimestamp;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}