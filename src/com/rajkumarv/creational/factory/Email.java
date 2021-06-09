package com.rajkumarv.creational.factory;

public class Email implements Communication{

    String recipient;
    String body;

    public Email(String recipient, String body){
        this.recipient = recipient;
        this.body = body;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public void setRecepient(String rec) {
        this.recipient = rec;
    }

    @Override
    public String getRecepient() {
        return this.recipient;
    }

    public boolean equals(Object obj) {
        Email other = (Email) obj;
        return other.getBody().equals(this.getBody()) &&
                other.getRecepient().equals(this.getRecepient());
    }

    @Override
    public String toString() {
        return "Email{" +
                "recipient='" + recipient + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
