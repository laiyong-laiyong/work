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
public class Version {

    private String buildDate;
    private String compiler;
    private String gitCommit;
    private String gitTreeState;
    private String gitVersion;
    private String goVersion;
    private String major;
    private String minor;
    private String platform;
    private String type;

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    public String getCompiler() {
        return compiler;
    }

    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    public String getGitCommit() {
        return gitCommit;
    }

    public void setGitTreeState(String gitTreeState) {
        this.gitTreeState = gitTreeState;
    }

    public String getGitTreeState() {
        return gitTreeState;
    }

    public void setGitVersion(String gitVersion) {
        this.gitVersion = gitVersion;
    }

    public String getGitVersion() {
        return gitVersion;
    }

    public void setGoVersion(String goVersion) {
        this.goVersion = goVersion;
    }

    public String getGoVersion() {
        return goVersion;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getMinor() {
        return minor;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}