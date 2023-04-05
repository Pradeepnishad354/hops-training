package com.test.collection.sett;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		// insertion order is preserve s
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		
	lh.add(10);
	lh.add(15);
	lh.add(13);
	lh.add(12);
	
	System.out.println(lh);
	
	for(Integer i:lh) {
		
		System.out.println(i);
	}
		
		
	}

}
