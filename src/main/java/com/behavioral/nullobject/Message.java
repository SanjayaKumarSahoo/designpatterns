package com.behavioral.nullobject;

public class Message {

	private final String type;
	private final String content;

	public Message(String type, String content) {
		this.type = type;
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public String getContent() {
		return content;
	}

}
