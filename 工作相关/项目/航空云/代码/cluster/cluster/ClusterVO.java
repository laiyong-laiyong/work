/**
 * Copyright 2022 bejson.com
 */
package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Auto-generated: 2022-01-13 20:0:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ClusterVO {

    private Actions actions;
    private String agentImage;
    private String agentImageOverride;
    private Allocatable allocatable;
    private Map<String, String> annotations;
    private Answers answers;
    private String apiEndpoint;
    private boolean appliedEnableNetworkPolicy;
    private String appliedPodSecurityPolicyTemplateId;
    private AppliedSpec appliedSpec;
    private String authImage;
    private String baseType;
    private String caCert;
    private Capabilities capabilities;
    private Capacity capacity;
    private CertificatesExpiration certificatesExpiration;
    private String clusterTemplateId;
    private String clusterTemplateRevisionId;
    private List<ComponentStatuses> componentStatuses;
    private List<Conditions> conditions;
    private String created;
    private long createdTS;
    private String creatorId;
    private String defaultClusterRoleForProjectMembers;
    private String defaultPodSecurityPolicyTemplateId;
    private String description;
    private String desiredAgentImage;
    private String desiredAuthImage;
    private String dockerRootDir;
    private String driver;
    private EksStatus eksStatus;
    private boolean enableClusterAlerting;
    private boolean enableClusterMonitoring;
    private boolean enableNetworkPolicy;
    private String fleetWorkspaceName;
    private GkeStatus gkeStatus;
    private String id;
    private boolean internal;
    private boolean istioEnabled;
    private Map<String, String> labels;
    private Limits limits;
    private Links links;
    private LocalClusterAuthEndpoint localClusterAuthEndpoint;
    private MonitoringStatus monitoringStatus;
    private String name;
    private int nodeCount;

    //自己增加的字段
    //worker数量
    private int workerCount;

    //worker可用数量
    private int availableCount;

    //cpu总量，单位固定为m，1m表示千分之一个cpu
    private int cpu_capacity;

    //内存总量，单位固定为ki
    private BigDecimal memory_capacity;

    //pod总量
    private int pods_capacity;

    //已分配cpu，单位固定为m，1m表示千分之一个cpu
    private int cpu_requested;

    //已分配内存，单位固定为ki
    private BigDecimal memory_requested;

    //已分配pod
    private int pods_requested;

    //master的ip集合
    private List<String> masterIps;

    //worker的ip集合
    private List<String> workerIps;

    //网络信息
    private NetworkInfo networkInfo;

    private int nodeVersion;
    private String provider;
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;
    private Requested requested;
    private ScheduledClusterScan scheduledClusterScan;
    private String state;
    private String transitioning;
    private String transitioningMessage;
    private String type;
    private String uuid;
    private Version version;
    private boolean windowsPreferedCluster;

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public Actions getActions() {
        return actions;
    }

    public void setAgentImage(String agentImage) {
        this.agentImage = agentImage;
    }

    public String getAgentImage() {
        return agentImage;
    }

    public void setAgentImageOverride(String agentImageOverride) {
        this.agentImageOverride = agentImageOverride;
    }

    public String getAgentImageOverride() {
        return agentImageOverride;
    }

    public void setAllocatable(Allocatable allocatable) {
        this.allocatable = allocatable;
    }

    public Allocatable getAllocatable() {
        return allocatable;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }

    public Answers getAnswers() {
        return answers;
    }

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public void setAppliedEnableNetworkPolicy(boolean appliedEnableNetworkPolicy) {
        this.appliedEnableNetworkPolicy = appliedEnableNetworkPolicy;
    }

    public boolean getAppliedEnableNetworkPolicy() {
        return appliedEnableNetworkPolicy;
    }

    public void setAppliedPodSecurityPolicyTemplateId(String appliedPodSecurityPolicyTemplateId) {
        this.appliedPodSecurityPolicyTemplateId = appliedPodSecurityPolicyTemplateId;
    }

    public String getAppliedPodSecurityPolicyTemplateId() {
        return appliedPodSecurityPolicyTemplateId;
    }

    public void setAppliedSpec(AppliedSpec appliedSpec) {
        this.appliedSpec = appliedSpec;
    }

    public AppliedSpec getAppliedSpec() {
        return appliedSpec;
    }

    public void setAuthImage(String authImage) {
        this.authImage = authImage;
    }

    public String getAuthImage() {
        return authImage;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setCaCert(String caCert) {
        this.caCert = caCert;
    }

    public String getCaCert() {
        return caCert;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCertificatesExpiration(CertificatesExpiration certificatesExpiration) {
        this.certificatesExpiration = certificatesExpiration;
    }

    public CertificatesExpiration getCertificatesExpiration() {
        return certificatesExpiration;
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

    public void setComponentStatuses(List<ComponentStatuses> componentStatuses) {
        this.componentStatuses = componentStatuses;
    }

    public List<ComponentStatuses> getComponentStatuses() {
        return componentStatuses;
    }

    public void setConditions(List<Conditions> conditions) {
        this.conditions = conditions;
    }

    public List<Conditions> getConditions() {
        return conditions;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCreated() {
        return created;
    }

    public void setCreatedTS(long createdTS) {
        this.createdTS = createdTS;
    }

    public long getCreatedTS() {
        return createdTS;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorId() {
        return creatorId;
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

    public void setDockerRootDir(String dockerRootDir) {
        this.dockerRootDir = dockerRootDir;
    }

    public String getDockerRootDir() {
        return dockerRootDir;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    public void setEksStatus(EksStatus eksStatus) {
        this.eksStatus = eksStatus;
    }

    public EksStatus getEksStatus() {
        return eksStatus;
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

    public void setGkeStatus(GkeStatus gkeStatus) {
        this.gkeStatus = gkeStatus;
    }

    public GkeStatus getGkeStatus() {
        return gkeStatus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public boolean getInternal() {
        return internal;
    }

    public void setIstioEnabled(boolean istioEnabled) {
        this.istioEnabled = istioEnabled;
    }

    public boolean getIstioEnabled() {
        return istioEnabled;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Links getLinks() {
        return links;
    }

    public void setLocalClusterAuthEndpoint(LocalClusterAuthEndpoint localClusterAuthEndpoint) {
        this.localClusterAuthEndpoint = localClusterAuthEndpoint;
    }

    public LocalClusterAuthEndpoint getLocalClusterAuthEndpoint() {
        return localClusterAuthEndpoint;
    }

    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
    }

    public MonitoringStatus getMonitoringStatus() {
        return monitoringStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNodeCount(int nodeCount) {
        this.nodeCount = nodeCount;
    }

    public int getNodeCount() {
        return nodeCount;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public int getCpu_capacity() {
        return cpu_capacity;
    }

    public void setCpu_capacity(int cpu_capacity) {
        this.cpu_capacity = cpu_capacity;
    }

    public BigDecimal getMemory_capacity() {
        return memory_capacity;
    }

    public void setMemory_capacity(BigDecimal memory_capacity) {
        this.memory_capacity = memory_capacity;
    }

    public int getPods_capacity() {
        return pods_capacity;
    }

    public void setPods_capacity(int pods_capacity) {
        this.pods_capacity = pods_capacity;
    }

    public int getCpu_requested() {
        return cpu_requested;
    }

    public void setCpu_requested(int cpu_requested) {
        this.cpu_requested = cpu_requested;
    }

    public BigDecimal getMemory_requested() {
        return memory_requested;
    }

    public void setMemory_requested(BigDecimal memory_requested) {
        this.memory_requested = memory_requested;
    }

    public int getPods_requested() {
        return pods_requested;
    }

    public void setPods_requested(int pods_requested) {
        this.pods_requested = pods_requested;
    }

    public boolean isAppliedEnableNetworkPolicy() {
        return appliedEnableNetworkPolicy;
    }

    public List<String> getMasterIps() {
        return masterIps;
    }

    public void setMasterIps(List<String> masterIps) {
        this.masterIps = masterIps;
    }

    public List<String> getWorkerIps() {
        return workerIps;
    }

    public void setWorkerIps(List<String> workerIps) {
        this.workerIps = workerIps;
    }

    public NetworkInfo getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public void setNodeVersion(int nodeVersion) {
        this.nodeVersion = nodeVersion;
    }

    public int getNodeVersion() {
        return nodeVersion;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public void setRancherKubernetesEngineConfig(RancherKubernetesEngineConfig rancherKubernetesEngineConfig) {
        this.rancherKubernetesEngineConfig = rancherKubernetesEngineConfig;
    }

    public RancherKubernetesEngineConfig getRancherKubernetesEngineConfig() {
        return rancherKubernetesEngineConfig;
    }

    public void setRequested(Requested requested) {
        this.requested = requested;
    }

    public Requested getRequested() {
        return requested;
    }

    public void setScheduledClusterScan(ScheduledClusterScan scheduledClusterScan) {
        this.scheduledClusterScan = scheduledClusterScan;
    }

    public ScheduledClusterScan getScheduledClusterScan() {
        return scheduledClusterScan;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setTransitioning(String transitioning) {
        this.transitioning = transitioning;
    }

    public String getTransitioning() {
        return transitioning;
    }

    public void setTransitioningMessage(String transitioningMessage) {
        this.transitioningMessage = transitioningMessage;
    }

    public String getTransitioningMessage() {
        return transitioningMessage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Version getVersion() {
        return version;
    }

    public void setWindowsPreferedCluster(boolean windowsPreferedCluster) {
        this.windowsPreferedCluster = windowsPreferedCluster;
    }

    public boolean getWindowsPreferedCluster() {
        return windowsPreferedCluster;
    }

}