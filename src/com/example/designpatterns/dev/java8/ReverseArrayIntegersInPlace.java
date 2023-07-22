package com.dev.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayIntegersInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 6, 7, 9 };
		reversedArrayInPlace(arr);

	}

	private static void reversedArrayInPlace(int[] arr) {
		// TODO Auto-generated method stub
		IntStream.range(0, arr.length / 2).forEach(i -> {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		});
		System.out.println("reversed array : " + Arrays.toString(arr));
	}

}
