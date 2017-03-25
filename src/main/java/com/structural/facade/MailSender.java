package com.structural.facade;


public class MailSender implements Sender {

    @Override
    public boolean send(MailDetails mailDetails) {
        // wrap the sending logic try and catch and send false if any exception else true
        System.out.println("Sending mail");
        return true;
    }
}
