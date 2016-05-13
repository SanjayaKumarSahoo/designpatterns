package com.behavioral.chainofresponsibility;

public class AfternoonGreetingServiceImpl implements GreetingService {

	private final TimeProvider provider;
	private GreetingService service;

	public AfternoonGreetingServiceImpl(TimeProvider provider) {
		this.provider = provider;
	}

	@Override
	public String greet(String message) {
		if (checkIfAfternoon(provider.getDateTime().getHours())) {
			return "Good Afternoon, " + message;
		} else {
			return getNext().greet(message);
		}
	}

	// Afternoon - 12 PM - 6 PM
	private boolean checkIfAfternoon(int hours) {
		return hours >= 12 && hours <= 17;
	}

	@Override
	public void setNext(GreetingService service) {
		this.service = service;
	}

	@Override
	public GreetingService getNext() {
		return service;
	}

}
