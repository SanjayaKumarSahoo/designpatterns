package com.structural.flyweight;

import static com.structural.flyweight.CoffeeFlavourFactory.lookup;
import static com.structural.flyweight.CoffeeFlavourFactory.totalCoffeeFlavoursMade;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

	private final List<Order> orders = new ArrayList<Order>();

	public void takeOrder(String flavourName, int table) {
		CoffeeFlavor flavour = lookup(flavourName);
		Order order = new Order(new Coffee(flavour), table);
		orders.add(order);
	}

	public void service() {
		for (Order order : orders) {
			order.serve();
		}
	}

	public String report() {
		return "CoffeeFlavour objects created: " + totalCoffeeFlavoursMade();
	}

}
