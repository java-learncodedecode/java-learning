package com.example.designpatterns.behavioral.command;

/**
 * A Command Pattern says that "encapsulate a request under an object as a
 * command and pass it to invoker object. Invoker object looks for the
 * appropriate object which can handle this command and pass the command to the
 * corresponding object and that object executes the command".
 * 
 * It is also known as Action or Transaction.
 * 
 * @author 310231625
 *
 */
public class MainClass {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();

		// we can change command dynamically
		remote.setCommand(new LightOnCommand(light));
		remote.buttonWasPressed();
		remote.setCommand(new StereoOnWithCDCommand(stereo));
		remote.buttonWasPressed();
		remote.setCommand(new StereoOffCommand(stereo));
		remote.buttonWasPressed();
	}
}
