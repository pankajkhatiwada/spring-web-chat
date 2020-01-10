package com.pankaj.chat.springwebchat.model;

/**
 * @author Pankaj Khatiwada
 */
public class UserResponse {

    private String content;

    public UserResponse() {
    }

    public UserResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
