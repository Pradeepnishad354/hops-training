package com.test.collection;

import java.util.Arrays;
import java.util.List;

public class CollectionJavaSort {
	
	public static void main(String[] args) {
		
		String[] name={"pradeep" ,"ashu", "priteshk","abhishekv","nirav"};
		
		
		
		
	Arrays.sort(name,(str1,str2)->str1.length()-str2.length());
	
	 Arrays.asList(name).forEach(System.out::println);
	
	
	
		
		
		
	}

}
