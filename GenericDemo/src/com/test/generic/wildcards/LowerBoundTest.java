package com.test.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundTest {
	public static void main(String[] args) {

		List<Object> obList = new ArrayList<>();

		addNumber(obList);

		List<Integer> inList = new ArrayList<>();
		inList.add(12);
		inList.add(14);
		addNumber(inList);

	}
// lower bound wild card 
	private static void addNumber(List<? super Integer> list) {

		for (int i = 1; i <= 10; i++) {

			list.add(i);

		}
		System.out.println(list);
	}
}
