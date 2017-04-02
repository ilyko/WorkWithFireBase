package com.slava.workwithfirebase;

/**
 * Created by Slava on 02.04.2017.
 */

public class ChatMessage {

    private String message;
    private String name;
    private String photoUrl;

    public ChatMessage(){

    }

    public ChatMessage(String message, String name, String photoUrl) {
        this.message = message;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
