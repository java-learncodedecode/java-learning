package com.dev.arrays;

import java.util.HashMap;

// Given a  array,we need to find all pairs whose sum is equal to number X.
public class AllPairsSumCloseNumber {

	public static void main(String[] args) {
		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		findPairsEqualsToXUsingHashing(array, 15);
	}

	public static void findPairsEqualsToXUsingHashing(int arr[], int X) {
		HashMap<Integer, Integer> elementIndexMap = new HashMap<Integer, Integer>();
		System.out.println("The pair whose sum is closest to 15 : ");
		for (int i = 0; i < arr.length; i++) {
			elementIndexMap.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			// we have used elementIndexMap.get(X-arr[i])!=i to avoid using same
			// element twice
			if (elementIndexMap.get(X - arr[i]) != null && elementIndexMap.get(X - arr[i]) != i) //
			{
				System.out.println(arr[i] + " " + (X - arr[i]));
			}
		}
	}
}
