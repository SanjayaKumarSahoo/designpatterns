package com.behavioral.chainofresponsibility;

public interface GreetingService {

	String greet(String message);

	void setNext(GreetingService service);

	GreetingService getNext();
}
