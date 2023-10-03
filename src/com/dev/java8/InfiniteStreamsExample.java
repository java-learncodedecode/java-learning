package com.dev.java8.infinitestreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamsExample {

	public static void main(String[] args) {
		
		// given
		Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);

		// when
		List<Integer> collect = infiniteStream
		  .limit(20)
		  .collect(Collectors.toList());
		System.out.println("stream sequence : "+collect);

		// then
		//assertEquals(collect, Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18));


	}

}
