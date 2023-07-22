package com.example.designpatterns.creational.singleton;

public class SuperClass implements Cloneable{

	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();  to clone object
		throw new CloneNotSupportedException(); //to avoid clone
	}

}
