package com.example.designpatterns.behavioral.IteratorPattern;

/**
 * According to GoF, Iterator Pattern is used "to access the elements of an
 * aggregate object sequentially without exposing its underlying
 * implementation".
 * 
 * 
 * The Iterator pattern is also known as Cursor. In collection framework, we are
 * now using Iterator that is preferred over Enumeration.
 *
 *
 * java.util.Iterator interface uses Iterator Design Pattern.
 *
 * Advantage of Iterator Pattern It supports variations in the traversal of a
 * collection. It simplifies the interface to the collection.
 */
public class MainClass {

	public static void main(String[] args) {

		NameRepository namesRepository = new NameRepository();
		Iterator iter = namesRepository.getIterator();
		while (iter.hasNext()) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
