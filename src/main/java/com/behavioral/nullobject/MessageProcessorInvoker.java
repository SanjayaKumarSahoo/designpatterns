package com.behavioral.nullobject;

public class MessageProcessorInvoker {

	public void invokeMessageProcessor(Message message) {
		switch (message.getType()) {
			case "JSON" :
				new JSONMessageProcessor().processMessage(message.getContent());
				break;
			case "XML" :
				new XMLMessageProcessor().processMessage(message.getContent());
				break;
			default :
				new NullMessageProcessor().processMessage(message.getContent());
				break;
		}
	}

}
