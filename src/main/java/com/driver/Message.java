package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;
    public Message(int id, String content) {
        this.id = id;
        this.content = content;
        this.timestamp= new Date(28-01-2023);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
