package com.rajkumarv.creational.factory;

public class CommunicationFactory {

    public CommunicationFactory(){
    }

    public Communication getCommunication(String type, String rec, String body){
        switch (type){
            case "email": return new Email(rec, body);
            case "sms": return new Sms(rec, body);
        }
        return null;
    }
}
