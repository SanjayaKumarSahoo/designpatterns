package com.structural.flyweight;

public class Coffee {

	private final CoffeeFlavor flavor;

	public Coffee(CoffeeFlavor flavor) {
		this.flavor = flavor;
	}

	public CoffeeFlavor getFlavor() {
		return flavor;		
	}

	@Override
	public String toString() {
		return "Coffee [flavor=" + flavor + "]";
	}	

}
