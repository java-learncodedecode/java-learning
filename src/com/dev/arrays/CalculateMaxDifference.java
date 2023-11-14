package com.dev.arrays;

public class CalculateMaxDifference {
	public static void main(String[] args) {
		int arr[] = { 16, 3, 6, 11, 4, 5 };
		int n = arr.length;
		System.out.println(getMaxDiff(arr, n));
		System.out.println(calculateMaxProfit(arr));
	}

	static int getMaxDiff(int arr[], int n) {
		if (arr.length < 2)
			return -1;
		// To store the minimum and the maximum
		// elements from the array
		int minEle = arr[0];
		int maxEle = arr[0];
		for (int i = 1; i < n; i++) {
			minEle = Math.min(minEle, arr[i]);
			maxEle = Math.max(maxEle, arr[i]);
		}

		return (maxEle - minEle);
	}

	static int calculateMaxProfit(int[] arr) {
		if (arr.length < 2)
			return 0; // If there are fewer than 2 elements, no profit can be made.

		int min = arr[0];
		int maxProfit = 0;

		for (int i = 1; i < arr.length; i++) {
			int next = arr[i];
			if (next < min) {
				min = next; // Update the minimum value
			} else {
				maxProfit = Math.max(maxProfit, next - min);
			}
		}

		return maxProfit;
	}
}
