package com.behavioral.command;

import org.junit.Test;

public class CommandTest {

	@Test
	public void testCommandSwitchOnAndOff() {
		Light light = new Light();
		Command switchOn = new SwitchOn(light);
		Command switchOff = new SwitchOff(light);

		// on command
		Switch mySwitch = new Switch();
		mySwitch.storeAndExecute(switchOn);

		// off command
		mySwitch.storeAndExecute(switchOff);
	}
}
