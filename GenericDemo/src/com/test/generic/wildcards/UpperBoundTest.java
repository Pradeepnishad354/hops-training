package com.test.generic.wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundTest {

	public static void main(String[] args) {
		
		List<Integer>inList= Arrays.asList(5,10,15,30);
		
		System.out.println(sumOfElement(inList));
		
		List<Double>inList2= Arrays.asList(5.0,10.3,15.4,30.0);
		System.out.println(sumOfElement(inList2));
		
		
		
	}

	// method with upper bound wildcard

	public static double sumOfElement(List<? extends Number> list) {

		double sum = 0.0;

		for (Number num : list) {
			sum = sum + num.doubleValue();
			
		}
		return sum;
	}
}
