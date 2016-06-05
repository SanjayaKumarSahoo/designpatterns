package com.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Acts as a factory and cache for CoffeeFlavour flyweight objects
public class CoffeeFlavourFactory {

	private static Map<String, CoffeeFlavor> flavours = new ConcurrentHashMap<String, CoffeeFlavor>();

	public static CoffeeFlavor lookup(String flavorName) {
		if (!flavours.containsKey(flavorName))
			flavours.put(flavorName, new CoffeeFlavor(flavorName));
		return flavours.get(flavorName);
	}

	public static int totalCoffeeFlavoursMade() {
		return flavours.size();
	}

}
