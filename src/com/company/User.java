package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User implements Observable {
    private ArrayList<Observer> observers;
    private String userName;
    private String status;
    private String avatar;
    private String phoneNumber;

    public User() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(o);
    }

    @Override
    public void notifyUserNameObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.updateUserName(userName);
        }
    }

    @Override
    public void notifyStatusObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.updateStatus(status);
        }
    }

    @Override
    public void notifyAvatarObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.updateAvator(avatar);
        }
    }

    @Override
    public void notifyPhoneNumberObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.updatePhoneNumber(phoneNumber);
        }
    }

    public void userNameChanged() {
        notifyUserNameObservers();
    }

    public void setUserName(String userName) {
        this.userName = userName;
        userNameChanged();
    }

    public void statusChanged() {
        notifyStatusObservers();
    }

    public void setStatus(String status) {
        this.status = status;
        statusChanged();
    }

    public void avatarChanged() {
        notifyAvatarObservers();
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        avatarChanged();
    }

    public void phoneNumberChanged() {
        notifyPhoneNumberObservers();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        phoneNumberChanged();
    }
}
