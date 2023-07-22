package com.example.designpatterns.creational.singleton;


/* 1. java.lang.Runtime, since on whole Java application only one runtime 
 * environment can be possible. 
 * 2. java.awt.Toolkit, AWT needs only a single object to perform 
 * the binding and the object is relatively expensive to create
 * 3. java.sql.DriverManager, 
 * even implementation of java.sql.Connection interface is Singleton.
 * SessionFactory is a singleton class that stores Connectors and 
 * allows to create Sessions of the required type.
 * the Logger class uses the Singleton pattern to ensure that only 
 * one instance of the logger is created and used throughout the entire application. 
*/
public class Singleton extends SuperClass {

	// Instance object
	private static Singleton sinletonInstance = null;

	// Default constructor private
	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (sinletonInstance == null) {
			synchronized (Singleton.class) {
				if (sinletonInstance == null) {
					sinletonInstance = new Singleton();
				}
			}
		}
		return sinletonInstance;
	}
}
