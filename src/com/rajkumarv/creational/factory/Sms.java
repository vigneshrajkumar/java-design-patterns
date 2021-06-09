package com.rajkumarv.creational.factory;

import java.util.Objects;

public class Sms implements Communication{
    String recipient;
    String body;

    public Sms(String recipient, String body){
        this.recipient = recipient;
        this.body = body;
    }

    @Override
    public void setBody(String body) {

    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public void setRecepient(String rec) {

    }

    @Override
    public String getRecepient() {
        return this.recipient;
    }

    public boolean equals(Object obj) {
        Sms other = (Sms) obj;
        return other.getBody().equals(this.getBody()) &&
                other.getRecepient().equals(this.getRecepient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipient, body);
    }

    @Override
    public String toString() {
        return "Sms{" +
                "recipient='" + recipient + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
