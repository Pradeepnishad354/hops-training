package com.test.method.reference;

import java.util.List;

public class StreamMain {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = List.of(22,44,56,33,46);
		
		System.out.println(list);
		
		list.stream().forEach(e->{
			System.out.println(e);
				
		});

		list.stream().forEach(System.out::println);
	
	}

}
