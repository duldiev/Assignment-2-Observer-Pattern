package com.company;

import java.sql.SQLOutput;

public class Follower implements Observer, DisplayElement {
    private String userName = "NewUser";
    private String status;
    private String avatar;
    private String phoneNumber;
    private Observable User;

    public Follower(Observable user) {
        this.User = user;
        user.registerObserver(this);
    }

    @Override
    public void updateUserName(String userName) {
        String lastUserName = this.userName;
        this.userName = userName;
        displayUserName(lastUserName);
    }

    @Override
    public void updateStatus(String status) {
        this.status = status;
        displayStatus();
    }

    @Override
    public void updateAvator(String avatar) {
        this.avatar = avatar;
        displayAvatar();
    }

    @Override
    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        displayPhoneNumber();
    }

    @Override
    public void displayUserName(String lastUserName) {
        System.out.println(lastUserName + " changed his username to " + userName);
    }

    @Override
    public void displayStatus() {
        System.out.println(userName + " changed status to \"" + status + "\"");
    }

    @Override
    public void displayAvatar() {
        System.out.println(userName + " changed profile image (" + avatar + ")");
    }

    @Override
    public void displayPhoneNumber() {
        System.out.println(userName + "'s new phone number, " + phoneNumber);
    }
}
