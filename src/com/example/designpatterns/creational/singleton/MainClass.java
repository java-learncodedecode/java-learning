package com.example.designpatterns.creational.singleton;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton object1 = Singleton.getInstance();
		Singleton clone = (Singleton) object1.clone();
		Singleton object2 = Singleton.getInstance();

		System.out.println(clone);
		System.out.println(object1);
		System.out.println(object2);
	}

}
