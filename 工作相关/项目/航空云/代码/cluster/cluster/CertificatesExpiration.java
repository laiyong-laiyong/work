/**
 * Copyright 2022 bejson.com
 */
package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2022-01-13 20:0:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class CertificatesExpiration {

    @JsonProperty("kube-apiserver")
    private KubeApiserver kube_apiserver;
    @JsonProperty("kube-apiserver-proxy-client")
    private KubeApiserverProxyClient kube_apiserver_proxy_client;
    @JsonProperty("kube-ca")
    private KubeCa kube_ca;
    @JsonProperty("kube-controller-manager")
    private KubeControllerManager kube_controller_manager;
    @JsonProperty("kube-node")
    private KubeNode kube_node;
    @JsonProperty("kube-proxy")
    private Kubeproxy kube_proxy;
    @JsonProperty("kube-scheduler")
    private KubeScheduler kube_scheduler;

    public KubeApiserver getKube_apiserver() {
        return kube_apiserver;
    }

    public void setKube_apiserver(KubeApiserver kube_apiserver) {
        this.kube_apiserver = kube_apiserver;
    }

    public KubeApiserverProxyClient getKube_apiserver_proxy_client() {
        return kube_apiserver_proxy_client;
    }

    public void setKube_apiserver_proxy_client(KubeApiserverProxyClient kube_apiserver_proxy_client) {
        this.kube_apiserver_proxy_client = kube_apiserver_proxy_client;
    }

    public KubeCa getKube_ca() {
        return kube_ca;
    }

    public void setKube_ca(KubeCa kube_ca) {
        this.kube_ca = kube_ca;
    }

    public KubeControllerManager getKube_controller_manager() {
        return kube_controller_manager;
    }

    public void setKube_controller_manager(KubeControllerManager kube_controller_manager) {
        this.kube_controller_manager = kube_controller_manager;
    }

    public KubeNode getKube_node() {
        return kube_node;
    }

    public void setKube_node(KubeNode kube_node) {
        this.kube_node = kube_node;
    }

    public Kubeproxy getKube_proxy() {
        return kube_proxy;
    }

    public void setKube_proxy(Kubeproxy kube_proxy) {
        this.kube_proxy = kube_proxy;
    }

    public KubeScheduler getKube_scheduler() {
        return kube_scheduler;
    }

    public void setKube_scheduler(KubeScheduler kube_scheduler) {
        this.kube_scheduler = kube_scheduler;
    }
}