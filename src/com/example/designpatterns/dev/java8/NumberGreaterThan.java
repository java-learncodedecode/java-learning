package com.dev.java8;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberGreaterThan {
	
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		int sum = numberList.stream().filter(i -> i> 5).mapToInt(Integer::intValue).sum();
		System.out.println("Sum :" +sum);
	}
}