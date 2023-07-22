package com.dev.arrays;

public class sort0and1and2Order {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		sort(a);
		for (int val : a) {
			System.out.print(val + " ");
		}
	}

	public static void sort(int[] a) {
		/*
		 * Three pointers to divide the array in designated segments as discussed in the
		 * post
		 */
		int low = 0, mid = 0, high = a.length - 1;
		while (mid <= high) {
			/*
			 * Case - 1, when element at mid pointer is zero, swap with element at low
			 */
			if (a[mid] == 0) {
				a[low] = swap(a[mid], a[mid] = a[low]);
				/*
				 * Increment low as well as mid, as we know the swapped element at mid is a one
				 */
				low++;
				mid++;
			}
			/*
			 * Case - 1, when element at mid pointer is two, swap with element at high
			 */
			else if (a[mid] == 2) {
				/*
				 * decrement only high and keep mid unchanged, as we do not know anything about
				 * the swapped element at mid
				 */
				a[high] = swap(a[mid], a[mid] = a[high]);
				high--;
			} else {
				/* Case - 3, when element at mid pointer is one */
				/* do nothing, and increment mid pointer */
				mid++;
			}
		}
	}

	/* utility swap function */
	public static int swap(int i, int j) {
		return i;
	}
}