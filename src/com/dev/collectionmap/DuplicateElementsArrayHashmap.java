package com.dev.collectionmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsArrayHashmap {

	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 9, 7, 13, 3, 2, 6, 9 };
		findDuplicatesUsingHashMap(array);
		findDuplicatesUsingJava8(array);
	}
	private static void findDuplicatesUsingHashMap(int[] inputArray) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int element : inputArray) {
			if (map.get(element) == null) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element) + 1);
			}
		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
			}
		}
	}
	//ing java8
	private static void findDuplicatesUsingJava8(int[] inputArray) 
	{   
	    Set<Integer> uniqueElements = new HashSet<>();
	         
	    Set<Integer> duplicateElements =  Arrays.stream(inputArray)
	                                            .filter(i -> !uniqueElements.add(i))
	                                            .boxed()
	                                            .collect(Collectors.toSet());
	         
	    System.out.println(duplicateElements);
	}
}
