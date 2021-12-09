package com.chat.websocket.entity;

import java.io.Serializable;

public class Message implements Serializable {

    private String text;
    private Long date;

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
}
