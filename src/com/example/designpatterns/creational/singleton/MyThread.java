package com.example.designpatterns.creational.singleton;

public class MyThread {

	public static void main(String[] args) {
		Singleton singleTonClass1 = Singleton.getInstance();
		Singleton singleTonClass2 = Singleton.getInstance();
		SingleTonThread obj1 = new SingleTonThread(singleTonClass1);
		SingleTonThread obj2 = new SingleTonThread(singleTonClass2);

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}

class SingleTonThread implements Runnable {

	Singleton singleTonClass;

	public SingleTonThread(Singleton singleTonClass) {
		this.singleTonClass = singleTonClass;
	}

	@Override
	public void run() {
		System.out.println(singleTonClass);

	}

}