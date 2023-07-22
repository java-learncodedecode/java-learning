package com.example.designpatterns.structural.composite;

/**
 * A Composite Pattern says that just "allow clients to operate in generic
 * manner on objects that may or may not represent a hierarchy of objects".
 * 
 * Advantage of Composite Design Pattern
It defines class hierarchies that contain primitive and complex objects.
It makes easier to you to add new kinds of components.
It provides flexibility of structure with manageable class or interface.
 *
 *
 *Usage of Composite Pattern
It is used:

When you want to represent a full or partial hierarchy of objects.
When the responsibilities are needed to be added dynamically to the individual objects without affecting other objects. Where the responsibility of object may vary from time to time.
 */

/**
 * The composite pattern is meant to allow treating individual objects and
 * compositions of objects, or â€œcompositesâ€� in the same way. It can be viewed as
 * a tree structure made up of types that inherit a base type, and it can
 * represent a single part or a whole hierarchy of objects.
 * 
 * @author 310231625
 *
 */
public class MainClass {

	public static void main(String[] args) {

		Leaf hd = new Leaf("HDD", 4000);
		Leaf kb = new Leaf("KB", 400);
		Leaf mouse = new Leaf("MOUSE", 300);
		Leaf monitor = new Leaf("Monitor", 9000);
		Leaf ram = new Leaf("ram", 2000);
		Leaf processor = new Leaf("processor", 19000);
		Leaf board = new Leaf("Board", 3000);

		Composite mb = new Composite("Mother board");
		mb.addComponents(ram);
		mb.addComponents(processor);
		mb.addComponents(board);

		Composite peri = new Composite("Peripheral");
		peri.addComponents(kb);
		peri.addComponents(mouse);
		peri.addComponents(monitor);

		Composite cpu = new Composite("Cabinet");
		cpu.addComponents(hd);
		cpu.addComponents(mb);

		Composite computer = new Composite("Computer");
		computer.addComponents(cpu);
		computer.addComponents(peri);

		computer.showPrice();

	}
}
