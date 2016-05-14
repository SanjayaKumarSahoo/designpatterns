package com.behavioral.command;

public class SwitchOn implements Command {

	private final Light light;
	
	public SwitchOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
