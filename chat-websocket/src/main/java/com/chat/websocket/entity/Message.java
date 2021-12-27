package com.chat.websocket.entity;

import java.io.Serializable;

public class Message implements Serializable {

    private String text;
    private Long date;
    private String username;
    private String type;
    private String color;

    private static final long serialVersionUID = 4779522479988537528l;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
