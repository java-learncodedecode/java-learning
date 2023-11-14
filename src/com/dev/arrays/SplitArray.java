package com.java.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SplitArray {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i += splitSize) {
            int endIndex = Math.min(i + splitSize, array.length);
            		//i+splitSize; this will set rest of index to 0
                    // eg [0,1,2][2,3,4][6, 7, 8][9, 0, 0]
            		
            int[] subarray = Arrays.copyOfRange(array, i, endIndex);
            resultList.add(subarray);
        }

        return resultList;
    }
}

