package com.ehsan.Interfaces;

public class UserInfo implements State{

    private String userName;
    private int password;

    public UserInfo(String userName, int password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void showUserStatement() {
        System.out.println("the username is: " + userName + " and the password is: " + password);
    }
}
