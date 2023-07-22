package com.dev.arrays;

// Given an array of integers representing stock price on a single day, 
// find max profit that can be earned by 1 transaction.
// array = {14, 12, 70, 15, 99, 65, 21, 90};
// Max profit can be gain by buying on 1st day(0 based indexing) and sell on the 4th day.
// Max profit = 99-12 =87
public class StockBuySellMaxProfit {

	public static void main(String[] args) {
		int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90, 105};
		System.out.println("Maximum profit :" + calculateMaxProfit(arr));

	}

	public static int calculateMaxProfit(int[] arr) {
		int lowestPriceTillThatDay = arr[0];
		int maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int profit = 0;
			if (arr[i] > lowestPriceTillThatDay) {
				profit = arr[i] - lowestPriceTillThatDay;
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			} else {
				lowestPriceTillThatDay = arr[i];
			}
		}
		return maxProfit;
	}

}
