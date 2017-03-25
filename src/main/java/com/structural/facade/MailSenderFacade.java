package com.structural.facade;


import static java.util.Arrays.asList;

public class MailSenderFacade {

    // hides content generator and mail sender sub system
    public boolean sendMail() {

        ContentGenerator contentGenerator = new MainContentGenerator();
        String body = contentGenerator.generate();
        MailDetails mailDetails = new MailDetails("Facade pattern",
                "from@gmail.com",
                asList("to@gmail.com"),
                asList("cc@gmail.com"),
                asList("bcc@gmail.com"),
                body);
        Sender sender = new MailSender();
        return sender.send(mailDetails);
    }

}
