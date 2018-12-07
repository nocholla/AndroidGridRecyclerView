package com.nocholla.gridrecyclerview.model;

import java.io.Serializable;

public class Image implements Serializable {
    private String name;
    private String url;
    private String timestamp;

    public Image(){

    }

    public Image(String name, String url, String timestamp){
        this.name = name;
        this.url = url;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
