package com.structural.proxy;

public class ProxyImage implements Image {

	private final String fileName;

	public ProxyImage(final String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void displayImage() {
		Image image = new RealImage(fileName);
		image.displayImage();
	}

}
