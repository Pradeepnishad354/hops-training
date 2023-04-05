package com.test.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
	public static void main(String[] args) {
		
		//filter (predicate)
		
		List<String> list = List.of("pradeep","pritesh","amit");
		List<String> collect = list.stream().filter(i->i.startsWith("p")).collect(Collectors.toList());
		
		System.out.println(collect);
		
		//map
		
		List<Integer> list2 = List.of(7,4,9,6,3);
		List<Integer> collect2 = list2.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(collect2);
		
		// sort
		list2.stream().sorted().forEach(e->{
			System.out.println(e);
		});
		
		//min 
		
		Integer integer = list2.stream().min((a,b)->a.compareTo(b)).get();
		
		System.out.println("minimum value is   "+integer);
		
		// max
		
		Integer integer2 = list2.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("maximum value is "+integer2);
		
		//count
		
		long count = list2.stream().count();
		System.out.println("count : "+ count);
	}

}
