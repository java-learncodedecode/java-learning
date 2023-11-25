package com.java.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SortByOccurrence {

	public static void main(String[] args) {

		// Sort Array base on number of occurance
		// input [4,4,4,8,8,8,8,6,6,9,2,2]
		// Expected Output : [9,6,6,2,2,4,4,4,8,8,8,8]

		// int arr[] = { 4, 4, 4, 8, 8, 8, 8, 6, 6, 9, 2, 2 };
		List<Integer> input = Arrays.asList(2,4, 4, 5, 8, 9, 8, 8, 6, 6, 9, 2, 2);

		Map<Integer, Long> map = input.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Integer> outPutList = new ArrayList<>();

		map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry -> {
			for (int i = 0; i < entry.getValue(); i++) {
				outPutList.add(entry.getKey());
			}
		});
		System.out.println(outPutList);

	}

}
