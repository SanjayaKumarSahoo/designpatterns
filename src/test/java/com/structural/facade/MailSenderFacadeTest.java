package com.structural.facade;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MailSenderFacadeTest {

    @Test
    public void shouldSendEMail() {
        MailSenderFacade facade = new MailSenderFacade();
        assertTrue(facade.sendMail());
    }
}
