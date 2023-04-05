package com.test.collection.sett;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet hs = new HashSet<>();// default capacity 16 Load factor 0.75

	//	HashSet hs = new HashSet<>(100);//

	//	HashSet hs = new HashSet<>(100,float(0.90);
		
		
		// add element 
		
		hs.add(100);
		hs.add("mahadev");
		hs.add(true);
		hs.add(null);
		hs.add(10.08);
		
		System.out.println(hs);// insertion order is not preserve 

		hs.remove(100); // remove the element 
		System.out.println("after the rempving the element "+hs);
		
		//contains 
		System.out.println(hs.contains("mahadev"));//true
		
		
		//isEmpty
		
		System.out.println(hs.isEmpty());//false
		
		// reading the object through for each loop
		
		for(Object o:hs) {
			
			System.out.println(o);
		}
		
	}

}
