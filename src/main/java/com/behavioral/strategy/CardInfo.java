package com.behavioral.strategy;

import java.util.Date;


public class CardInfo {

    private final String cardHolderName;
    private final String cardNumber;
    private final Date cardExpiry;
    private final String cvv;

    public CardInfo(String cardHolderName, String cardNumber, Date cardExpiry, String cvv) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cardExpiry = cardExpiry;
        this.cvv = cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getCardExpiry() {
        return cardExpiry;
    }

    public String getCvv() {
        return cvv;
    }
}
