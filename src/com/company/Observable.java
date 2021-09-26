package com.company;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyUserNameObservers();
    void notifyStatusObservers();
    void notifyAvatarObservers();
    void notifyPhoneNumberObservers();
}
