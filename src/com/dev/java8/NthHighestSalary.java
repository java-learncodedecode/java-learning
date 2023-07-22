package com.dev.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NthHighestSalary {

	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap<>();
	map.put("Alok", 15000);
	map.put("Aditya", 5000);
	map.put("Rahul", 25000);
	map.put("Pradeep", 25000);
	map.put("Praveen", 25000);
	map.put("Santosh", 5000);
	map.put("Deepak", 15000);
	
	Entry<Integer, List<String>> nthHighestSalary = getNthHighestSalary(map , 1);
	System.out.println(nthHighestSalary);

	}
	
	public static Entry<Integer, List<String>> getNthHighestSalary(Map<String, Integer> map, int num) {

		return map.entrySet().stream()
		.collect(Collectors.groupingBy(Map.Entry::getValue, 
				Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).
		          entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		          .collect(Collectors.toList()).get(num-1);

	}

}
