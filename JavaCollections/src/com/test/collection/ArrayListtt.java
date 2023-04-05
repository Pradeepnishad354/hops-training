package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtt {

	public static void main(String[] args) {
		
		
		String arr[]= {"pritesh","raju","ritesh","amit"};
		
		for(String  s:arr) {
			
			System.out.println(s);
		}

		// convert array into arrayList
		
		ArrayList a = new ArrayList(Arrays.asList(arr));
		
		System.out.println(a);
		
	}

}
