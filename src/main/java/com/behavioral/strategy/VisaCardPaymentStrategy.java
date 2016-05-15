package com.behavioral.strategy;

/**
 * Created by sanjaya on 15/5/16.
 */
public class VisaCardPaymentStrategy implements PaymentStrategy {

	@Override
	public boolean pay(PaymentInfo payment) {
		// pay through visa card
		// logic to pay through visa card
		System.out.println("Payment by visa card");
		return true;
	}
}
