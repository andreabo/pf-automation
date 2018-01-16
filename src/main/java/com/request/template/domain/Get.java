package com.request.template.domain;

import java.util.Map;

public class Get extends Method {

    public static final String NAME = "GET";
    private Map<String, String> params;

    public Get() {
        super();
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Get{" +
                "NAME='" + NAME + '\'' +
                ", headers=" + this.getHeaders() +
                ", params=" + params +
                '}';
    }
}
