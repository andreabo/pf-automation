package com.request.template.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.request.template.domain.Get;
import com.request.template.domain.Request;
import com.request.template.domain.Service;

import java.io.File;
import java.util.List;

public class RequestParser {
    protected List<Request> getRequests(String serviceName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource(serviceName.toLowerCase() + ".yml").getFile());
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Service service = mapper.readValue(file, Service.class);
            return service.getRequests();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected Request getRequest(String serviceName, String requestName, String method) {
        List<Request> requests = getRequests(serviceName);
        Request finalRequest = new Request();
        for (Request request : requests) {
            if (request.getUrl().equalsIgnoreCase("/" + requestName)) {
                if (method.equalsIgnoreCase(Get.NAME)) {
                    finalRequest.setUrl(request.getUrl());
                    finalRequest.setGet(request.getGet());
                    finalRequest.setPost(null);
                } else {
                    finalRequest.setUrl(request.getUrl());
                    finalRequest.setGet(null);
                    finalRequest.setPost(request.getPost());
                }
            }
        }
        return finalRequest;
    }

    public static void main(String[] args) {
        Request request = new RequestParser().getRequest("specification", "factoring", "GET");
        System.out.println(request.toString());
    }

}
