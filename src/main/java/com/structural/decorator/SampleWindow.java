package com.structural.decorator;

public class SampleWindow implements Window {

	@Override
	public void draw() {
		System.out.println("Drawing window");
	}

	@Override
	public String getDescription() {
		return "This is a Sample window";
	}

}
