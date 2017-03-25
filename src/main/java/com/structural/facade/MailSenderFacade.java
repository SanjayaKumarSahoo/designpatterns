package com.structural.facade;


import static java.util.Arrays.asList;

public class MailSenderFacade {

    public boolean sendMail() {

        ContentGenerator contentGenerator = new MainContentGenerator();
        String body = contentGenerator.generate();
        MailDetails mailDetails = new MailDetails("Facade pattern",
                asList("a@gmail.com"),
                asList("b@gmail.com"),
                asList("b@gmail.com"),
                body);
        Sender sender = new MailSender();
        return sender.send(mailDetails);
    }

}
