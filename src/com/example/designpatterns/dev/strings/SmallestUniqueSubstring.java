package com.dev.strings;

import java.util.HashMap;
import java.util.Map;

public class SmallestUniqueSubstring {

	final static int MAX_CHARS = 256;

	// 2. method to return distinct chars
	// Find maximum distinct characters in any string
	static int max_distinct_char(String str, int n) {
		// Initialize all character's count with 0
		int count[] = new int[MAX_CHARS];
		int max_distinct = 0;
		// Increase the count of max_distinct if a character
		// is found to have a frequency of 1
		for (int i = 0; i < n; i++) {
			count[str.charAt(i)]++;
			if (count[str.charAt(i)] == 1)
				max_distinct++;
		}
		return max_distinct;
	}

	// 1. method to return smallest substring
	static int smallestSubstr_maxDistictChar(String str) {
		int n = str.length();
		int unique = max_distinct_char(str, n); // number of unique characters
		int result = Integer.MAX_VALUE;    // to store the result
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		int j = 0;              // starting index of window
		for (int i = 0; i < str.length(); i++) {
			// add the current chararcter in window
			char c = str.charAt(i);
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
			// while no. of distinct elements in the map is
			// equal to unique characters and starting
			// element of the window has frequency more than
			// one we keep reducing its frequency and
			// increasing the starting point of the window
			while (hm.size() == unique && hm.get(str.charAt(j)) > 1) {
				hm.put(str.charAt(j), (hm.get(str.charAt(j)) - 1));
				j++;
			}
			System.out.println("unique substring is :" +hm.size());
			// if size of map is equal to unique elements
			// update the result
			if (hm.size() == unique)
				result = Math.min((i - j + 1), result);
		}
		return result;
	}

	static public void main(String[] args) {
		// Input String
		String str = "cbacdcbc";

		int len = smallestSubstr_maxDistictChar(str);
		System.out.println(
				" The length of the smallest substring" + " consisting of maximum distinct " + "characters : " + len);
	}

}
