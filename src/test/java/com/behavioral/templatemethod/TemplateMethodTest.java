package com.behavioral.templatemethod;

import org.junit.Test;

public class TemplateMethodTest {

	@Test
	public void testTemplateMethod() {
		Processor xmlProcessor = new XMLProcessor();
		xmlProcessor.process();
		
		Processor jsonProcessor = new JSONProcessor();
		jsonProcessor.process();
	}
}
