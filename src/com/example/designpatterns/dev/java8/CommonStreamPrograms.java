package com.dev.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonStreamPrograms {
	public static void main(String[] args) {

        // 1. find occurrence of each char in string
		String str = "ilovejava";
		String wordStr = "I love java coding";
		String[] input1 = wordStr.split(" ");
		String[] input = str.split("");
		// System.out.println(Arrays.toString(input));
		Map<String, Long> map = Arrays.stream(input)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Char occurrence count: " + map);
		
		// Print the duplicate characters and their occurrences
		map.forEach((character, count) -> {
            if (count > 1) {
                System.out.println("Character '" + character + "' occurs " + count + " times.");
            }
        });

		// word count test
		Map<String, Long> map1 = Arrays.stream(input1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Word occurrence count: " + map1);

		// 2. find duplicate/unique chars from given string
		List<String> duplicateChars = Arrays.stream(input)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Duplicate chars: " + duplicateChars);

		List<String> uniqueChars = Arrays.stream(input)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Unique chars: " + uniqueChars);

		// 3. find first non repeat element from given string
		String firstNonRepeat = Arrays.stream(input)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println("First Non Repeated chars is : " + firstNonRepeat);

		// 4. find second highest element from given array
		int num[] = { 1, 3, 5, 8, 9, 4, 11, 7 };
		Integer secondHighestNumber = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println("Second Highest Number: " + secondHighestNumber);

		// 5. find longest string from given string array
		String strArray[] = { "java", "java8", "spring", "springboot", "microservices" };
		String longestString = Arrays.stream(strArray)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("Longest string is : " + longestString);
		
		if (strArray == null || strArray.length == 0) {
            System.out.println("stirng is null"); // Handle the case when the array is empty or null
        }

        String longStr = Arrays.stream(strArray)
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse(null);
        System.out.println(longStr);

		String longestStringFromString = Arrays.stream(input1)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("Longest string is : " + longestStringFromString);

		// find length of longest string
		int maxLength = Arrays.stream(strArray).mapToInt(string -> string.length()).max().orElse(0);
		System.out.println("length of longest string : " + maxLength);

		// 4. find elements starts with 1 given array
		int number[] = { 11, 32, 53, 18, 29, 44, 11, 127, 31, 91, 1111 };
		List<String> str1 = Arrays.stream(number).boxed().map(s -> s + "").filter(s -> s.contains("12"))
				.collect(Collectors.toList());
		System.out.println("Elements starts with 12 are :" + str1);

		// skip &limit examples
		IntStream.rangeClosed(1, 10).skip(1).limit(8).boxed() // boxed is to convert data types
				.map(n -> n + " ").forEach(System.out::print);

		System.out.println("");

		String text = "Hello, World!";

		String convertedText = text.chars().mapToObj(Character::toUpperCase)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		System.out.println(convertedText);

	}

}
