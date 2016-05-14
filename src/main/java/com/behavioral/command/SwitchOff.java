package com.behavioral.command;

public class SwitchOff implements Command {

	private final Light light;

	public SwitchOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
