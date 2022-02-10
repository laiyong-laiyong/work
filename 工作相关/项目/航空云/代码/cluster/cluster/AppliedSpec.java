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
public class AppliedSpec {

    private String agentImageOverride;
    private Answers answers;
    private String clusterTemplateId;
    private String clusterTemplateRevisionId;
    private String defaultClusterRoleForProjectMembers;
    private String defaultPodSecurityPolicyTemplateId;
    private String description;
    private String desiredAgentImage;
    private String desiredAuthImage;
    private String displayName;
    private String dockerRootDir;
    private boolean enableClusterAlerting;
    private boolean enableClusterMonitoring;
    private boolean enableNetworkPolicy;
    private String fleetWorkspaceName;
    private boolean internal;
    private LocalClusterAuthEndpoint localClusterAuthEndpoint;
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;
    private ScheduledClusterScan scheduledClusterScan;
    private String type;
    private boolean windowsPreferedCluster;

    public void setAgentImageOverride(String agentImageOverride) {
        this.agentImageOverride = agentImageOverride;
    }

    public String getAgentImageOverride() {
        return agentImageOverride;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }

    public Answers getAnswers() {
        return answers;
    }

    public void setClusterTemplateId(String clusterTemplateId) {
        this.clusterTemplateId = clusterTemplateId;
    }

    public String getClusterTemplateId() {
        return clusterTemplateId;
    }

    public void setClusterTemplateRevisionId(String clusterTemplateRevisionId) {
        this.clusterTemplateRevisionId = clusterTemplateRevisionId;
    }

    public String getClusterTemplateRevisionId() {
        return clusterTemplateRevisionId;
    }

    public void setDefaultClusterRoleForProjectMembers(String defaultClusterRoleForProjectMembers) {
        this.defaultClusterRoleForProjectMembers = defaultClusterRoleForProjectMembers;
    }

    public String getDefaultClusterRoleForProjectMembers() {
        return defaultClusterRoleForProjectMembers;
    }

    public void setDefaultPodSecurityPolicyTemplateId(String defaultPodSecurityPolicyTemplateId) {
        this.defaultPodSecurityPolicyTemplateId = defaultPodSecurityPolicyTemplateId;
    }

    public String getDefaultPodSecurityPolicyTemplateId() {
        return defaultPodSecurityPolicyTemplateId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDesiredAgentImage(String desiredAgentImage) {
        this.desiredAgentImage = desiredAgentImage;
    }

    public String getDesiredAgentImage() {
        return desiredAgentImage;
    }

    public void setDesiredAuthImage(String desiredAuthImage) {
        this.desiredAuthImage = desiredAuthImage;
    }

    public String getDesiredAuthImage() {
        return desiredAuthImage;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDockerRootDir(String dockerRootDir) {
        this.dockerRootDir = dockerRootDir;
    }

    public String getDockerRootDir() {
        return dockerRootDir;
    }

    public void setEnableClusterAlerting(boolean enableClusterAlerting) {
        this.enableClusterAlerting = enableClusterAlerting;
    }

    public boolean getEnableClusterAlerting() {
        return enableClusterAlerting;
    }

    public void setEnableClusterMonitoring(boolean enableClusterMonitoring) {
        this.enableClusterMonitoring = enableClusterMonitoring;
    }

    public boolean getEnableClusterMonitoring() {
        return enableClusterMonitoring;
    }

    public void setEnableNetworkPolicy(boolean enableNetworkPolicy) {
        this.enableNetworkPolicy = enableNetworkPolicy;
    }

    public boolean getEnableNetworkPolicy() {
        return enableNetworkPolicy;
    }

    public void setFleetWorkspaceName(String fleetWorkspaceName) {
        this.fleetWorkspaceName = fleetWorkspaceName;
    }

    public String getFleetWorkspaceName() {
        return fleetWorkspaceName;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public boolean getInternal() {
        return internal;
    }

    public void setLocalClusterAuthEndpoint(LocalClusterAuthEndpoint localClusterAuthEndpoint) {
        this.localClusterAuthEndpoint = localClusterAuthEndpoint;
    }

    public LocalClusterAuthEndpoint getLocalClusterAuthEndpoint() {
        return localClusterAuthEndpoint;
    }

    public void setRancherKubernetesEngineConfig(RancherKubernetesEngineConfig rancherKubernetesEngineConfig) {
        this.rancherKubernetesEngineConfig = rancherKubernetesEngineConfig;
    }

    public RancherKubernetesEngineConfig getRancherKubernetesEngineConfig() {
        return rancherKubernetesEngineConfig;
    }

    public void setScheduledClusterScan(ScheduledClusterScan scheduledClusterScan) {
        this.scheduledClusterScan = scheduledClusterScan;
    }

    public ScheduledClusterScan getScheduledClusterScan() {
        return scheduledClusterScan;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setWindowsPreferedCluster(boolean windowsPreferedCluster) {
        this.windowsPreferedCluster = windowsPreferedCluster;
    }

    public boolean getWindowsPreferedCluster() {
        return windowsPreferedCluster;
    }

}