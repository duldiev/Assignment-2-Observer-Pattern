package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        Follower follower1 = new Follower(user);

        user.setUserName("myNewUsername");
        user.setUserName("myNextNewUsername");
        user.setPhoneNumber("+77854353498");
        user.setStatus("Life is good!");
    }
}
