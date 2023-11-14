package com.dev.arrays;

public class MissingElementFinder {
    public static int findMissingElement(int[] arr) {
        int n = arr.length;
        
        // Calculate the expected sum of the elements in the sequence
        int expectedSum = 0;
        for (int i = 0; i <= n; i++) {
            expectedSum += arr[0]+i;
        }
        
        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // Find the missing element
        int missingElement = expectedSum - actualSum;
        return missingElement;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5,6, 7, 8, 10};
        int missingElement = findMissingElement(arr);
        
        System.out.println("Missing element is: " + missingElement);
    }
}