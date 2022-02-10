/**
 * Copyright 2022 bejson.com
 */
package com.sobey.jcg.sobeypaas.data.k8s.rancher.vo.cluster;

import java.util.List;

/**
 * Auto-generated: 2022-01-13 20:0:29
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ComponentStatuses {

    private List<Conditions> conditions;
    private String name;
    private String type;

    public void setConditions(List<Conditions> conditions) {
        this.conditions = conditions;
    }

    public List<Conditions> getConditions() {
        return conditions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}