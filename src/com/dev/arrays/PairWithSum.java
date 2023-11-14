package com.dev.arrays;

import java.util.HashSet;

public class PairWithSum {
    public static void findPairWithSum(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = targetSum - num;

            if (set.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                break;
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10,11};
        int targetSum = 16;
        findPairWithSum(arr, targetSum);
    }
}

