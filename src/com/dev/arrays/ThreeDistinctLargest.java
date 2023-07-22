package com.dev.arrays;

import java.util.Arrays;

public class ThreeDistinctLargest {
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,5,9,11,6,14,14,19,19};
		threeDistinctLargest(arr);	
	}
	
	
	static void threeDistinctLargest(int arr[]) {
		Arrays.sort(arr);  // quick sort with averagecase O(nlogn)
		int n = arr.length;
		int check = 0, count=0;
		for(int i=1; i<n; i++) {
			if(count<3) {
				if(check != arr[n-i]) {
					System.out.println(arr[n-i]+" ");
					check= arr[n-i];
					count++;
				}
			}
		}
	}
	


}
