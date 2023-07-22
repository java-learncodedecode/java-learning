package com.dev.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("java", 1);
		map.put("java8", 6);
		map.put("oracle", 9);
		map.put("csharp", 7);
		map.put("python", 4);
	
	
	List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
	Collections.sort(entries, (o1,o2) -> o1.getKey().compareTo(o2.getKey()));
	
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out :: println);;
	System.out.println("*************");
	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out :: println);;
	}

}
