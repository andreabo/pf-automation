package com.request.template.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.request.template.domain.Request;

import java.io.File;

public class RequestTemplate {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("specification.yaml").getFile());
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Request request = mapper.readValue(file, Request.class);
            System.out.println(request.getPost().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
