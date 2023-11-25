package com.java.dev;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Design and implement algorithm to find most frequently occurring word(s) in given input.
Example Input : "Alok is employee of ABC company, 
alok is from Bangalore, 'ALOK!! is good in algorithms. Al'ok, a strong technical expert"
Expected output:
Alok – 3
is - 3*/
public class ProbleSolving {

	public static void main(String[] args) {
		
		String str = "alok Alok is employee of ABC company, alok is from Bangalore, 'ALOK!! is good in algorithms. Al'ok, a strong technical expert";
        String[] input =str.toLowerCase().split("[^a-zA-Z']+");
        
        Arrays.stream(input).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().
        stream().reduce((s1,s2) -> s1.getValue() > s2.getValue() ? s1:s2);
        
        System.out.println(Arrays.stream(input).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().
        stream().reduce((s1,s2) -> s1.getValue() > s2.getValue() ? s1:s2));
        
       Map<String, Long> wordMap =Arrays.stream(input).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       
       //wordMap.entrySet().stream().map(s-> s.getKey().contains());
        
        
        
        
		
		
		
		
	}

}
