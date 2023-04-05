package com.test.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> list1 = List.of(12, 55, 66, 77, 88, 9, 33, 22, 44);

		ArrayList<Object> list2 = new ArrayList<>();

		// without stream
		for (Integer i : list1) {

			if (i % 2 == 0) {
				list2.add(i);

			}
		}
		System.out.println(list2);

		// with stream api
		
		Stream<Integer> stream = list1.stream();
		
		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
	}

}
