package com.structural.flyweight;

public class Order {

	private final Coffee cofee;
	private final int tableNumber;

	public Order(Coffee cofee, int tableNumber) {
		this.cofee = cofee;
		this.tableNumber = tableNumber;
	}

	public void serve() {
		System.out.println("Serving " + cofee + " to table " + tableNumber);
	}
}
