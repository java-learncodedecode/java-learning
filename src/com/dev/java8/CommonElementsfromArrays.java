package com.dev.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsfromArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 5, 7, 9, 3 };
		int arr2[] = { 1, 0, 5, 4, 6, 3 };

		List<Integer> commonElements = Arrays.stream(arr1)
				.filter(number -> Arrays.stream(arr2).anyMatch(arr2num -> arr2num == number)).boxed()
				.collect(Collectors.toList());
		System.out.println("Common Elements : " + commonElements);
	}
}
