package com.behavioral.nullobject;

import org.junit.Test;

public class NullObjectTest {
	
	@Test
	public void nullObjectPatternTest(){
		MessageProcessorInvoker invoker = new MessageProcessorInvoker();
		invoker.invokeMessageProcessor(new Message("PROTOBUF", "Sample protobuf message"));
	}
}
