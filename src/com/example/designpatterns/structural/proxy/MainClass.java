package com.example.designpatterns.structural.proxy;

public class MainClass {

	public static void main(String[] args) {
		//ProxyPattern
		//Controls and manage access to the object they are protecting
		
		Image image = new ProxyImage("abcd");
		image.display();
	}
}
