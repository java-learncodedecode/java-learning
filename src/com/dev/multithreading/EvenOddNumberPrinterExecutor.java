package com.dev.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddNumberPrinterExecutor {
	private static final int MAX_NUMBER = 20;
	private static final int THREAD_COUNT = 2;
	private static final AtomicInteger counter = new AtomicInteger(1);

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

		executorService.execute(new OddNumberPrinter());
		executorService.execute(new EvenNumberPrinter());

		executorService.shutdown();
	}

	static class EvenNumberPrinter implements Runnable {
		@Override
		public void run() {
			while (true) {
				synchronized (counter) {
					int number = counter.getAndIncrement();
					if (number > MAX_NUMBER) {
						break;
					}
					if (number % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + ": " + number);
					} else {
						counter.decrementAndGet();
					}
				}
			}
		}
	}

	static class OddNumberPrinter implements Runnable {
		@Override
		public void run() {
			while (true) {
				synchronized (counter) {
					int number = counter.getAndIncrement();
					if (number > MAX_NUMBER) {
						break;
					}
					if (number % 2 != 0) {
						System.out.println(Thread.currentThread().getName() + ": " + number);
					} else {
						counter.decrementAndGet();
					}
				}
			}
		}
	}
}
