package com.irem.DependencyInversion.message;

public class Sms implements Message{

    @Override
    public void sendMessage() {
        sendSms();
    }

    public void sendSms(){

    }
}
