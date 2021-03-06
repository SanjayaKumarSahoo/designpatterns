package com.structural.facade;


import java.util.List;

public class MailDetails {

    private final String subject;
    private final String from;
    private final List<String> to;
    private final List<String> cc;
    private final List<String> bcc;
    private final String contents;

    public MailDetails(String subject, String from, List<String> to, List<String> cc, List<String> bcc, String contents) {
        this.subject = subject;
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.contents = contents;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getTo() {
        return to;
    }

    public List<String> getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public String getContents() {
        return contents;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "MailDetails{" +
                "subject='" + subject + '\'' +
                ", from='" + from + '\'' +
                ", to=" + to +
                ", cc=" + cc +
                ", bcc=" + bcc +
                ", contents='" + contents + '\'' +
                '}';
    }
}
