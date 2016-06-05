package com.structural.proxy;

import org.junit.Test;

public class ImageProxyTest {

	private final Image classUnderTest = new ProxyImage("photo.jpeg");

	@Test
	public void test() {
		classUnderTest.displayImage();
	}

}
