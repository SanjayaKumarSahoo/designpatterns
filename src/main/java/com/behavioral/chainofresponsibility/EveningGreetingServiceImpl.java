package com.behavioral.chainofresponsibility;

public class EveningGreetingServiceImpl implements GreetingService {

	private final TimeProvider provider;
	private GreetingService service;

	public EveningGreetingServiceImpl(TimeProvider provider) {
		this.provider = provider;
	}

	@Override
	public String greet(String message) {
		if (checkIfEvening(provider.getDateTime().getHours())) {
			return "Good Evening, " + message;
		} else {
			return getNext().greet(message);
		}
	}

	// Evening - 6 PM - 12 AM
	private boolean checkIfEvening(int hours) {
		return hours >= 18 && hours <= 23;
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
