package com.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Switch {

	private List<Command> history = new ArrayList<Command>();

	public void storeAndExecute(Command cmd) {
		// storing history of commands, if required
		this.history.add(cmd);
		cmd.execute();
	}
}
