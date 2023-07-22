package com.dev.multithreading;

public class PrintOddEvenNumbers {

	// public int print_numbers_upto = 10;
	int counter = 1;
	static int N;

	public void printOddNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + ":" + counter);
				counter++;
				notify();
			}
		}
	}

	public void printEvenNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + ":" + counter);
				counter++;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		N = 10;
		PrintOddEvenNumbers oddeven = new PrintOddEvenNumbers();
		// Create thread t1
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				oddeven.printEvenNumber();
			}
		});
		// Create thread t2
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				oddeven.printOddNumber();
			}
		});
		// Start both threads
		// t1.setName("Thread-odd");
		t1.start();
		t2.start();
	}
}
