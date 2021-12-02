package com.irem.DependencyInversion.message;

public class Email implements Message{

    @Override
    public void sendMessage() {
        sendEmail();
    }

    public void sendEmail(){

    }
}
