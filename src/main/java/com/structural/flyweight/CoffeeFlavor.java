package com.structural.flyweight;

//Instances of CoffeeFlavour will be the Flyweights (intrinsic object state can be shared)
public class CoffeeFlavor {

	private final String name;

	public CoffeeFlavor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
