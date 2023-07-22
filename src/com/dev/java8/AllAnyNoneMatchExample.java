package com.dev.java8;

import java.util.Arrays;
import java.util.List;

/* allMatch() checks if the predicate is true for all the elements in the stream. 
 * Here, it returns false as soon as it encounters 5, which is not divisible by 2.
 */

/*anyMatch() checks if the predicate is true for any one element in the stream. 
 * Here, again short-circuiting is applied and true is returned immediately after the first element.
 */

/*noneMatch() checks if there are no elements matching the predicate.
 *  Here, it simply returns false as soon as it encounters 6, which is divisible by 3.
 */
public class AllAnyNoneMatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    List<Integer> intList = Arrays.asList(2, 4, 5, 7, 8);
	    
	    boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
	    boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
	    boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
	    
	    System.out.println(allEven);
	    System.out.println(oneEven);
	    System.out.println(noneMultipleOfThree);

	}

}
