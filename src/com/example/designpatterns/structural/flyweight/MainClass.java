package com.example.designpatterns.structural.flyweight;

/*
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.
 *
 *Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. Only 5 colors are available so color property is used to check already existing Circle objects.
 */
public class MainClass {

	private static final String colors[] = { "Red", "Green", "Blue" };

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			String color = getRandomColor();
			Circle circle = (Circle) ShapeFactory.getCircle(color);
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
			System.out.println(color + " " + circle);
		}

	}

}
