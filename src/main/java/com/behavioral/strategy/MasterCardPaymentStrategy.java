package com.behavioral.strategy;

public class MasterCardPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean pay(PaymentInfo payment) {
        // pay through master card
		// logic to pay through visa card
        System.out.println("Payment by master card");
        return true;
    }
}
