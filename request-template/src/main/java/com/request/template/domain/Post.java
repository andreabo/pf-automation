package com.request.template.domain;

import com.fasterxml.jackson.databind.JsonNode;

public class Post extends Method {

    final String NAME = "POST";

    private JsonNode body;

    public Post() {
        super();
    }

    public JsonNode getBody() {
        return body;
    }

    public void setBody(JsonNode body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "NAME='" + NAME + '\'' +
                ", headers=" + this.getHeaders() +
                ", body=" + body +
                '}';
    }
}
