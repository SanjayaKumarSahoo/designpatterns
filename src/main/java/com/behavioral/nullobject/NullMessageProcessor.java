package com.behavioral.nullobject;

public class NullMessageProcessor implements MessageProcessor {

	@Override
	public void processMessage(String message) {
		// NO logic of any message process
		System.out.println("Message type not supported, so no processing");
	}
}
