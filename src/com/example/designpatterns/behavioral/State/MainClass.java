package com.example.designpatterns.behavioral.State;

/**
 * A State Pattern says that "the class behavior changes based on its state". In
 * State Pattern, we create objects which represent various states and a context
 * object whose behavior varies as its state object changes.
 * 
 * The State Pattern is also known as Objects for States.
 * 
 * Benefits: It keeps the state-specific behavior. It makes any state
 * transitions explicit. Usage: When the behavior of object depends on its state
 * and it must be able to change its behavior at runtime according to the new
 * state. It is used when the operations have large, multipart conditional
 * statements that depend on the state of an object.
 * 
 * @author 310231625
 *
 */
public class MainClass {
	public static void main(String[] args) {
		String str = args[0];
		Controller controller = new Controller();
		// the following trigger should be made by the user
		if (str.equalsIgnoreCase("management"))
			controller.setManagementConnection();
		if (str.equalsIgnoreCase("sales"))
			controller.setSalesConnection();
		if (str.equalsIgnoreCase("accounting"))
			controller.setAccountingConnection();
		controller.open();
		controller.log();
		controller.close();
		controller.update();

	}
}
