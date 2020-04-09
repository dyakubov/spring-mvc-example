package ru.geekbrains.persist;

public class SearchRequest {
    private String request;

    public SearchRequest(String request) {
        this.request = request;
    }

    public SearchRequest() {
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
