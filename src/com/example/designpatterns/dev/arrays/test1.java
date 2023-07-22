package com.dev.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {
	
	public static void main(String[] args) {
		String str = "java";
		String[] inp = str.split("");
		for(int i=0; i< str.length(); i++) {
			System.out.println(inp[i]);
		}
	List<String> listStr = Arrays.stream(inp).map(x-> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(listStr.toArray());
	}

}
