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
public class Services {

    private Etcd etcd;
    private KubeApi kubeApi;
    private KubeController kubeController;
    private Kubelet kubelet;
    private Kubeproxy kubeproxy;
    private Scheduler scheduler;
    private String type;

    public void setEtcd(Etcd etcd) {
        this.etcd = etcd;
    }

    public Etcd getEtcd() {
        return etcd;
    }

    public void setKubeApi(KubeApi kubeApi) {
        this.kubeApi = kubeApi;
    }

    public KubeApi getKubeApi() {
        return kubeApi;
    }

    public void setKubeController(KubeController kubeController) {
        this.kubeController = kubeController;
    }

    public KubeController getKubeController() {
        return kubeController;
    }

    public void setKubelet(Kubelet kubelet) {
        this.kubelet = kubelet;
    }

    public Kubelet getKubelet() {
        return kubelet;
    }

    public void setKubeproxy(Kubeproxy kubeproxy) {
        this.kubeproxy = kubeproxy;
    }

    public Kubeproxy getKubeproxy() {
        return kubeproxy;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}