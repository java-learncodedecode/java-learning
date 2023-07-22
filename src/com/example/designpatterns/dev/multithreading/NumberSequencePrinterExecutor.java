package com.dev.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberSequencePrinterExecutor {
	private static final int THREAD_COUNT = 3;

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

		for (int i = 0; i < THREAD_COUNT; i++) {
			executorService.execute(new NumberTask());
		}

		executorService.shutdown();
	}

	static class NumberTask implements Runnable {
		private static final int MAX_NUMBER = 10;
		private static final Object lock = new Object();
		private static int counter = 1;

		@Override
		public void run() {
			while (true) {
				synchronized (lock) {
					if (counter > MAX_NUMBER) {
						lock.notifyAll(); // Notify other threads to break from waiting
						break;
					}
					if (counter % THREAD_COUNT == (counter / THREAD_COUNT) % THREAD_COUNT) {
						System.out.println(Thread.currentThread().getName() + ": " + counter);
						counter++;
						lock.notifyAll(); // Notify other threads to continue waiting
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
