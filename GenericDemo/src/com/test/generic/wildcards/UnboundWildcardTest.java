package com.test.generic.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundWildcardTest {
	
	public static void main(String[] args) {
		
		List<Integer> inList=new ArrayList<>();
		inList.add(10);
		inList.add(12);
		inList.add(14);
		printElement(inList);
		
		List<Double> doubleList= Arrays.asList(19.0,11.0,22.3);
		
		printElement(doubleList);
		
	}

	//method with unboundwildcard
	public static void printElement(List<?> list) {
		
		for(Object element : list) {
			
			System.out.println(element);
		}
	}
}
