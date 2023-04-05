package com.test.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// 1.blank stream
		Stream<Object> emptyStream = Stream.empty();

		emptyStream.forEach(e -> {

			System.out.println(e);
		});

		// 2 array,object,collection

		String[] name = { "pradeep", "amit", "saurabh", "arun", "milan" ,"aman"};

		Stream<String> stream1 = Stream.of(name);
		
		List<String> collect = stream1.filter(a->a.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);

//		stream1.forEach(e -> {
//
//			System.out.println(e);
//
//		});
		
    //3.builder 
		Stream<Object> build = Stream.builder().build();

		
		//4. arrays.stream method 
		                                 //pass anonymous array
		IntStream stream = Arrays.stream(new int[] {2,4,5,657,776});
		
		stream.forEach(e->{
			
			System.out.println(e);
		});
	}

}
