package com.structural.privateclassdata;


import java.util.List;

public class MailSender {

    private final MailDetailsData mailDetailsData;

    public MailSender(String subject, String from, List<String> to, List<String> cc, List<String> bcc, String contents) {
        this.mailDetailsData = new MailDetailsData(subject, from, to, cc, bcc, contents);
    }

    public void sendMail() {
        System.out.println("Start sending email...");
        System.out.println("TO : " + mailDetailsData.getTo());
        System.out.println("FROM : " + mailDetailsData.getFrom());
        System.out.println("CC : " + mailDetailsData.getCc());
        System.out.println("CC : " + mailDetailsData.getBcc());
    }

    public String getSubject() {
        return mailDetailsData.getSubject();
    }

    public String getFrom() {
        return mailDetailsData.getFrom();
    }

    public List<String> getTo() {
        return mailDetailsData.getTo();
    }

    public List<String> getCc() {
        return mailDetailsData.getCc();
    }

    public List<String> getBcc() {
        return mailDetailsData.getBcc();
    }

    public String getContents() {
        return mailDetailsData.getContents();
    }
}

