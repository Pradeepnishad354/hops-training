package com.test.generic.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// generics List
public class GenericList {
	
	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		
		l.add("amit");
		l.add("saurabh");
		l.add("pradeep");
		l.add("amit1");
		System.out.println(l);
		
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			
			String next = iterator.next();
			System.out.println(next);
		}
	}

}
