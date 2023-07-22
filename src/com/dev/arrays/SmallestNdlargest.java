package com.dev.arrays;

public class SmallestNdlargest {
	/*
	 * Java program to Find Largest and Smallest Number in an Array
	 */
	public static void main(String[] args) {

		// array of 10 numbers
		int arr[] = { 12, 56, 76, 89, 100, 343, 21, 234 };

		// assign first element of an array to largest and smallest
		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];

		}
		System.out.println("Smallest Number is : " + smallest + " and Largest Number is : " + largest);
	}
}