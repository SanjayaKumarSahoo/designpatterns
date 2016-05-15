package com.behavioral.strategy;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {

	private final List<Item> items;
	private final PaymentStrategy paymentStrategy;
	private final CardInfo cardInfo;

	public ShoppingCart(List<Item> items, PaymentStrategy paymentStrategy, CardInfo cardInfo) {
		this.items = items;
		this.paymentStrategy = paymentStrategy;
		this.cardInfo = cardInfo;
	}

	public List<Item> getItems() {
		return items;
	}

	public boolean doPay() {

		// calculate total amount
		BigDecimal total = BigDecimal.ZERO;
		for (Item item : items) {
			total = total.add(item.getPrice());
		}

		PaymentInfo paymentInfo = new PaymentInfo.Builder().withCardExpiry(cardInfo.getCardExpiry()).withCardHolderName(cardInfo.getCardHolderName()).withCardNumber(cardInfo.getCardNumber()).withCVV(cardInfo.getCvv()).withAmount(total).build();
		return paymentStrategy.pay(paymentInfo);
	}

}
