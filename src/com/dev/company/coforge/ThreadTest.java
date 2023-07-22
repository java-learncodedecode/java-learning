package com.dev.company.coforge;

//10.Mph "Geeks GFG Geeks for"
public class ThreadTest implements Runnable {

	public void run() {  //5
		System.out.printf("GFG "); 
		System.out.printf("Geeks ");
	}

	public static void main(String[] args) {
		ThreadTest obj = new ThreadTest(); //1
		Thread thread = new Thread(obj); //2
		thread.start();                  //3
		System.out.printf("Geeks ");  //4
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("for "); //6
	}
}
