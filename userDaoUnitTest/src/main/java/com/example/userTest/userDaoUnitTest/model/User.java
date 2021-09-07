package com.example.userTest.userDaoUnitTest.model;

public class User {

    private Long userId;
    private String userName;
    private String userPassword;

    public User(String userName, String userPassword)
    {
        this.userName=userName;
        this.userPassword=userPassword;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
