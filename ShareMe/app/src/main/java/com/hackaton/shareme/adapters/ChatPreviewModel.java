package com.hackaton.shareme.adapters;

public class ChatPreviewModel {
    private String person;
    private String last_msg;
    // Constructor
    public ChatPreviewModel(String person, String last_msg) {
        this.person = person;
        this.last_msg = last_msg;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getLast_msg() {
        return last_msg;
    }

    public void setLast_msg(String last_msg) {
        this.last_msg = last_msg;
    }
}
