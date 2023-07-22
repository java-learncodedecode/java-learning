package com.example.designpatterns.structural.proxy1;

public class MainClass {

	public static void main(String[] args) throws Exception {
		//ProxyPattern
		//Controls and manage access to the object they are protecting
		
		Internet internet = new ProxyInternet();
		internet.connectTo("abc.com");
	}
}
