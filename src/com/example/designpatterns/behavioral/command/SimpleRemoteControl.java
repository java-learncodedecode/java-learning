package com.example.designpatterns.behavioral.command;

public class SimpleRemoteControl {
	Command command; // only one button

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		// set the command the remote will
		// execute
		this.command = command;
	}

	public void buttonWasPressed() {
		command.execute();
	}
}
