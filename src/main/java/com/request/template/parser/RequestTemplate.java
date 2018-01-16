package com.request.template.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.request.template.domain.Service;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class RequestTemplate {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("specification.yaml").getFile());
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            //mapper.enableDefaultTyping();
            Service service = mapper.readValue(file, Service.class);
            System.out.println(service.toString());
  //          System.out.println(service.getRequests().get(0).getGet().getHeaders().toString());


//            Map<String, String> test = new HashMap<String, String>();

            //test.put("pf-tenant-id", "abc");
            //test.put("pf-financial-insitution-id", "otro-abc");
            //service.getRequests().get(0).getGet().setHeaders(test);
            //System.out.println(service.getRequests().get(0).getGet().getHeaders().toString());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
