package com.test.collection;

import java.util.ArrayList;

public class ListToArray1 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> ar=new ArrayList<>();
		ar.add("ashok");
		ar.add("ramesh");
		ar.add("mahadev");
		ar.add("pritesh");
		
		System.out.println(ar);
		
		// initialize an array 
		
		String st[]= new String[ar.size()];
		
//		
//		ar.toArray(st);
//		
//		for(int i=0; i<st.length; i++) {
//			
//			System.out.println(st[i]);
//		}
		
		// without using library function
		System.out.println("print the array withou tusing library function");
		
		for(int i=0; i<st.length; i++) {
			st[i] = ar.get(i);
		}
		
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i]);
		}
		
	}

}
