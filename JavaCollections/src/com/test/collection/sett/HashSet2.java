package com.test.collection.sett;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber=new HashSet<>();
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		
		System.out.println(evenNumber);
		
		// add all the element into another hashset
		HashSet<Integer> n=new HashSet<>();
		n.add(10);
		n.addAll(evenNumber);
		System.out.println("new HashSet"+n);
		
		//remove All
		
		n.removeAll(evenNumber);
		
		System.out.println(n);
		
		// convert set into arraylist then we can get the element
		
		ArrayList<Integer> a=new ArrayList<>(evenNumber);
		System.out.println("convert set into arraylist "+a);
		
		
		System.out.println(a.get(1));
		
	}

}
