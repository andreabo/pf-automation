package com.request.template.domain;

import java.util.HashMap;
import java.util.Map;

public class Method {

    protected Map<String, String> headers;

    public Method() {
        this.headers = new HashMap<String, String>();
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

}
