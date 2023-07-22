package com.dev.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaTest {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("allahabad", "bangalore", "chennai", "kanpur", "agra");
		List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 2, 3, 44, 55, 56, 5, 5);

		String word = "zzzAzzNzzzIzzY";
		char findWord = 'z';

		long noOfElements = cities.stream().count();
		int noOfElements2 = (int) cities.stream().count();

		System.out.println("number of elements in list : " + noOfElements2);
		System.out.println("number of elements in list in long : " + noOfElements);

		// 2 lists, flattening and counting
		List<List<? extends Object>> list = Arrays.asList(cities, numbers);
		int elementsCount = (int) list.stream().flatMap(i -> i.stream()).count();
		System.out.println("number of elements in list after flattening : " + elementsCount);

		// Using forEach() and lamda ?

		// get count after filtering EVEN numbers
		long count1 = numbers.stream().filter(i -> i % 2 == 0).count();
		System.out.println("count after filtering EVEN numbers : " + count1);

		// get count after filtering length > 5
		long count2 = cities.stream().filter(str -> str.length() > 5).count();
		System.out.println("count after filtering" + " String length greater 5 : " + count2);

		// get count after removing duplicates
		long count3 = numbers.stream().distinct().count();

		// print to console
		System.out.println("count after removing duplicates" + " from Integer elements : " + count3);

		long count4 = cities.stream().filter(city -> city.startsWith("T")).count();
		System.out.println("count for companies " + "starting with alphabet 'T' : " + count4);

		long count = word // original source
				.chars() // provides IntStream
				.filter(s -> s == findWord) // intermediate operation
				.count(); // terminal operation
		System.out.println("Character '" + findWord + "' repeated " + count + " times");

		// 2. sorting using Stream's sorted() method
		List<String> sortedCityNames = cities // original source elements
				.stream() // 2.1 get sequential stream
				.sorted() // 2.2 sorting alphabetical order of String elements
				.collect(Collectors.toList()); // 2.3 collect to new list after sorting
		System.out.println("Sorted city Names in Alphabetical order :\n");
		sortedCityNames.forEach(System.out::println);

		// collect distinct elements and sort in REVERSE order
		List<Integer> distinctNumbers = numbers.stream().distinct().sorted(Comparator.reverseOrder()) // reverse order
				.collect(Collectors.toList());
		System.out.println("\nReverse sorted distinct numbers : ");
		distinctNumbers.forEach(number -> System.out.println(number));

		// collect distinct cities and map to upper Case
		List<String> distinctCities = cities.stream().distinct() // removes duplicates
				.map(String::toUpperCase) // converts to upper case
				.collect(Collectors.toList());
		System.out.println("\nDistinct cities in upper case :");
		distinctCities.forEach(System.out::println);

		// collect distinct sectors and filter, sort and map to lower Case
		List<String> distinctCities1 = cities.stream().distinct() // removes duplicates
				.filter(str -> str.startsWith("a")) // filter
				.sorted() // natural alphabetical order
				.map(String::toUpperCase) // converts to lower case
				.collect(Collectors.toList());
		System.out.println("Sectors with distinct, filtered, sorted and mapped :- \n");
		distinctCities1.forEach(System.out::println);
	}

}