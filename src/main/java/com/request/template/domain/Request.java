package com.request.template.domain;

public class Request {

    private String url;
    private Get get;
    private Post post;

    public Request() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public Get getGet() {
        return get;
    }

    public void setGet(Get get) {
        this.get = get;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


    @Override
    public String toString() {
        return "Request{" +
                "url='" + url + '\'' +
                ", get=" + get +
                ", post=" + post +
                '}';
    }


}
