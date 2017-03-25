package com.structural.privateclassdata;


import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class MailSenderTest {

    @Test
    public void shouldWrapDataWithPrivateDataClass() {
        MailSender sender = new MailSender("Facade pattern",
                "from@gmail.com",
                asList("to@gmail.com"),
                asList("cc@gmail.com"),
                asList("bcc@gmail.com"),
                "some message body");

        assertEquals(sender.getSubject(), "Facade pattern");
        assertEquals(sender.getFrom(), "from@gmail.com");
        assertEquals(sender.getTo(), asList("to@gmail.com"));
        assertEquals(sender.getCc(), asList("cc@gmail.com"));
        assertEquals(sender.getBcc(), asList("bcc@gmail.com"));
        assertEquals(sender.getContents(), "some message body");

    }
}
