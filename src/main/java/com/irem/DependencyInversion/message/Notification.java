package com.irem.DependencyInversion.message;

import java.util.List;

public class Notification<List> {
    private java.util.List<Message> messages;

    public <List> Notification(java.util.List<Message> messages) {
        this.messages = messages;
    }

    public void sender() {
        for (Message message : messages) {
            message.sendMessage();
        }
    }
}
