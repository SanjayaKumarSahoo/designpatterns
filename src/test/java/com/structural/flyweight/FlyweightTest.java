package com.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

import com.structural.flyweight.CoffeeShop;

public class FlyweightTest {

	@Test
	public void orderCofee() {
		CoffeeShop shop = new CoffeeShop();
		shop.takeOrder("Frappe", 1);
		shop.takeOrder("Frappe", 2);
		shop.takeOrder("Espresso", 3);
		shop.takeOrder("Cappuccino", 4);
		shop.service();
		Assert.assertEquals("CoffeeFlavour objects created: 3", shop.report());
	}
}
