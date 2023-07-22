package com.dev.company.coforge;

// Immutable Class
/*
   java.math.BigDecimal
   java.io.File
   java.util.Locale
   java.util.UUID
   java.util.Collections
   java.net.URL
   java.net.URI
   Most of the Enum classes
   */
// Marker Interfaces
/*
 * Serializable interface
 * Cloneable interface
 * Remote interface
 */

//Custom Annotations

public class ZeroesToEnd {

	/* 1.
	 * The approach is pretty simple. We will use 0 as a pivot element and whenever
	 * we see a non zero element we will swap it with the pivot element. So all the
	 * non zero element will come at the beginning.
	 */
	public static void main(String[] args) {
		
		
	        int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
	        int n = A.length;
	        int j = 0;
	        for (int i = 0; i < n; i++) {
	            if (A[i] != 0) {
	                //   Swap - A[j] , A[i]
	                swap(A, i, j); // Partitioning the array
	                j++;
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print(A[i] + " ");
	        }
	    }

	// Utility function to swap two elements of an array
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}