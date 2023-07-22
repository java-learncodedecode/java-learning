package com.dev.multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProcessorWithExecutorFramework {

	public static void main(String[] args) {
		List<String> folderPaths = List.of("C:/Users/320146640/Downloads/test/folder1",
				"C:/Users/320146640/Downloads/test/folder2", "C:/Users/320146640/Downloads/test/folder3");
		int numThreads = 5;

		readFilesInFolders(folderPaths, numThreads);
	}

	private static void readFilesInFolders(List<String> folderPaths, int numThreads) {
		ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

		for (String folderPath : folderPaths) {
			File folder = new File(folderPath);
			if (folder.exists() && folder.isDirectory()) {
				File[] files = folder.listFiles();
				if (files != null) {
					for (File file : files) {
						executorService.submit(() -> processFile(file));
					}
				}
			}
		}

		executorService.shutdown();
	}

	private static void processFile(File file) {
		synchronized (FileProcessorWithExecutorFramework.class) {
			System.out.println("Thread-name : " +Thread.currentThread().getName());
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = reader.readLine()) != null) {
					// Process the line of data from the file
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
