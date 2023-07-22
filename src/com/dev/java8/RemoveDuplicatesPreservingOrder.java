package com.dev.java8;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesPreservingOrder {
	public static void main(String[] args) {
		// Sample array with duplicates
		Integer[] arrayWithDuplicates = { 2, 5, 8, 2, 9, 1, 6, 8, 5 };
		String[] stringWithDuplicates = {"apple", "orange", "banana", "apple", "grape", "orange", "kiwi"};
		// Convert the array to a list and then use a stream to remove duplicates while
		// preserving order
		LinkedHashSet<Integer> uniqueElements = Arrays.stream(arrayWithDuplicates).collect(LinkedHashSet::new,
				LinkedHashSet::add, LinkedHashSet::addAll);
		LinkedHashSet<String> uniqueStringElements = Arrays.stream(stringWithDuplicates)
                .collect(LinkedHashSet::new, LinkedHashSet::add, LinkedHashSet::addAll);

		// Convert the unique elements back to an array
		Integer[] arrayWithoutDuplicates = uniqueElements.toArray(new Integer[0]);
		String[] stringWithoutDuplicates = uniqueStringElements.toArray(new String[0]);
		// Print the array without duplicates
		System.out.println("Array without duplicates, preserving order:");
		for (Integer element : arrayWithoutDuplicates) {
			System.out.print(element + " ");
		}
		System.out.println("\n--------------");
		for (String element : stringWithoutDuplicates) {
			System.out.print(element + " ");
		}
	}

}
