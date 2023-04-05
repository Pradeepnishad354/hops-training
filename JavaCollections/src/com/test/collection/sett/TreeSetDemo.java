package com.test.collection.sett;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		
		// it prints the element in default natural sorting order
		
		TreeSet<Integer> t = new TreeSet<>();
		t.add(10);
		t.add(120);
		
		t.add(200);
		t.add(30);
		
		System.out.println(t);
	}

}
