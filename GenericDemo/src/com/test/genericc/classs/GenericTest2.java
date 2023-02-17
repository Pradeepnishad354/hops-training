package com.test.genericc.classs;

import java.util.ArrayList;
import java.util.Iterator;

// java generics 
public class GenericTest2 {
	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<>();
		a.add("m");
		a.add("n");
		//a.add(new Integer(10));
		
		Iterator<String> iterator = a.iterator();
		while(iterator.hasNext()) {
			
			String next = iterator.next();
			System.out.println(next);
		}
	}

}
