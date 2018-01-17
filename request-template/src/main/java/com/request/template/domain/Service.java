package com.request.template.domain;

import java.util.List;

public class Service {
    private String name;
    private List<Request> requests;

    public Service() {
    }

    public List<Request> getRequests() {
        return requests;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", requests=" + requests +
                '}';
    }
}
