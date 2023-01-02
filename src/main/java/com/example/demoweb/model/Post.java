package com.example.demoweb.model;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text) {
        this.text = text;
    }

    public String GetText() {
        return this.text;
    }

    public Integer GetLikes() {
        return this.likes;
    }
}
