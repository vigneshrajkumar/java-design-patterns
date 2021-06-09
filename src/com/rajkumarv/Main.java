package com.rajkumarv;

import com.rajkumarv.creational.factory.Communication;
import com.rajkumarv.creational.factory.CommunicationFactory;
import com.rajkumarv.creational.factory.Email;
import com.rajkumarv.creational.factory.Sms;

public class Main {

    public static void main(String[] args) {

        CommunicationFactory commFact = new CommunicationFactory();

        Communication com = null;
        System.out.println(com);

        com = commFact.getCommunication("email","vignesh@gmail.com", "attack at dawn");
        System.out.println(com);

        com = commFact.getCommunication("sms","vignesh@gmail.com", "attack at dawn");
        System.out.println(com);

    }
}
