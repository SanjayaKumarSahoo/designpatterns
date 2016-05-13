package com.behavioral.chainofresponsibility;

public class MorningGreetingServiceImpl implements GreetingService {

	private final TimeProvider provider;
	private GreetingService service;

	public MorningGreetingServiceImpl(TimeProvider provider) {
		this.provider = provider;
	}

	@Override
	public String greet(String message) {
		if (checkIfMorning(provider.getDateTime().getHours())) {
			return "Good Morning, " + message;
		} else {
			return getNext().greet(message);
		}
	}

	// Morning- 12 AM - 12 PM
	private boolean checkIfMorning(int hours) {
		return hours >= 0 && hours <= 11;
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
