package com.dev.arrays;

// time complexity
public class Oand1sinArray {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 1, 1, 0, 1 };
		int arr1[] = { 0, 1, 1, 0, 1, 0, 1, 0, 1 };
		arr = separate0s1sSolution1(arr);
		System.out.print("Array after separating 0's and 1's : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int size = arr.length;
		arr1 = separate0s1sSolution2(arr1, size);
		System.out.println("\n----- solution2 ----");
		System.out.print("Array after separating 0's and 1's : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
    // solution 1
	// Time Complexity: O(2n)
	// Auxiliary Space: O(1)
	static int[] separate0s1sSolution1(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 1;
		}
		return arr;
	}
	// solution 2
	// Time Complexity: O(n)
	// Auxiliary Space: O(1)
	public static int[] separate0s1sSolution2(int arr[], int size) {
		int left = 0, right = size - 1;
		  
        while (left < right) 
        {
            /* Increment left index while we see 0 at left */
            while (arr[left] == 0 && left < right)
               left++;
  
            /* Decrement right index while we see 1 at right */
            while (arr[right] == 1 && left < right)
                right--;
  
            /* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
            if (left < right) 
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
		return arr;
	}
}