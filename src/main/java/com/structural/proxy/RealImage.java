package com.structural.proxy;

public class RealImage implements Image {

	private final String fileName;

	public RealImage(final String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void displayImage() {
		System.out.println("File displayed :: " + fileName);
	}

}
