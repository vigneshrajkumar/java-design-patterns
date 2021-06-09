package com.rajkumarv.creational.factory.tests;

import com.rajkumarv.creational.factory.Communication;
import com.rajkumarv.creational.factory.CommunicationFactory;
import com.rajkumarv.creational.factory.Email;
import com.rajkumarv.creational.factory.Sms;

import static org.junit.jupiter.api.Assertions.*;
/*
*   Factory method returns one of the possible classes, that share a common super class
* */
class CommunicationFactoryTest {

    @org.junit.jupiter.api.Test
    void createSms(){
        CommunicationFactory cf = new CommunicationFactory();
        Communication sms = cf.getCommunication("sms", "vig@gmail.com", "attack at dawn");

        Communication smsAssert = new Sms("vig@gmail.com", "attack at dawn");
        assertEquals(smsAssert, sms);
    }

    @org.junit.jupiter.api.Test
    void createEmail(){
        CommunicationFactory cf = new CommunicationFactory();
        Communication email = cf.getCommunication("email", "vig@gmail.com", "attack at dawn");

        Communication emailAssert = new Email("vig@gmail.com", "attack at dawn");
        assertEquals(emailAssert, email);
    }
}