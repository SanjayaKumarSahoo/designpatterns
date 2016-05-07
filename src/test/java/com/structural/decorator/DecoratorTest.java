package com.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {
	@Test
	public void testDecorator() {
		Window window = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SampleWindow()));
		Assert.assertEquals("This is a Sample window, including vertical scrollbars, including horizontal scrollbars", window.getDescription());

	}
}
