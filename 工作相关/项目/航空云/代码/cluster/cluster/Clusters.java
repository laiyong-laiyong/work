package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import java.util.List;

/**
 * @author 赖勇
 * @create 2022/1/14 10:44
 */
public class Clusters {
    private List<ClusterVO> data;

    public List<ClusterVO> getData() {
        return data;
    }

    public void setData(List<ClusterVO> data) {
        this.data = data;
    }
}
