package com.dev.arrays;

public class FindAnElement {
    public static int findElement(int[] arr, int targetElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetElement) {
                return i;  // Return the index of the element if found
            }
        }
        return -1;  // Return -1 to indicate that the element was not found
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int elementToFind = 6;

        int index = findElement(myArray, elementToFind);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
