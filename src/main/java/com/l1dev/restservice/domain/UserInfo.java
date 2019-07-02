package com.l1dev.restservice.domain;

public class UserInfo {

    private final String userName;
    private final String userText;

    public UserInfo(String userName, String userText) {
        this.userName = userName;
        this.userText = userText;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserText() {
        return userText;
    }

}
