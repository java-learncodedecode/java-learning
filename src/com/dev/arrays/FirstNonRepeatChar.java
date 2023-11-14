package com.java.dev;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {

	public static void main(String[] args) {

		String s = "I went to the zoo and was welcomed by the zebra inside the cage";
		String newS = s.toLowerCase();

		String[] input = newS.split("");

		String ch = Arrays.stream(input)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println(ch);
	}
}
