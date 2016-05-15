package com.behavioral.strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void testVisaCardPaymentStrategy() {
		Item mac = new Item(1, new BigDecimal(1000));
		Item ipad = new Item(2, new BigDecimal(500));
		CardInfo cardInfo = new CardInfo("ALLEN", "1234 5678 9012", createADate(2018, 5, 23), "725");
		ShoppingCart cart = new ShoppingCart(Arrays.asList(mac, ipad), new VisaCardPaymentStrategy(), cardInfo);
		cart.doPay();
	}

	@Test
	public void testMasterCardPaymentStrategy() {
		Item mac = new Item(1, new BigDecimal(1000));
		Item ipad = new Item(2, new BigDecimal(500));
		CardInfo cardInfo = new CardInfo("ALLEN", "1234 5678 9013", createADate(2018, 5, 23), "726");
		ShoppingCart cart = new ShoppingCart(Arrays.asList(mac, ipad), new MasterCardPaymentStrategy(), cardInfo);
		cart.doPay();
	}

	private Date createADate(int withYear, int withMonth, int withDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(withYear, withMonth, withDate);
		return calendar.getTime();
	}
}
