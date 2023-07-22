package com.dev.java8;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethod {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("1", "2", "3", "4", "5");
		String patternJoin = String.join("-", str);
		System.out.println("Pattern String: "+patternJoin);
	}
}
