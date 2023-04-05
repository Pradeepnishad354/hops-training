package com.test.collection;

import java.util.LinkedList;

public class LinkedListt {
	public static void main(String[] args) {

		LinkedList l = new LinkedList<>();

		l.add("amit");
		l.add("pritesh");

		l.add(1);
		l.add(null);
		l.add(10.7);

		System.out.println(l);

		System.out.println(l.size());

		System.out.println(l.get(0));// Retrieving the value

//		System.out.println(l.remove(1));//remove element
//		System.out.println(l);

		l.add(1, true);
		System.out.println("after imserting the element " + l);

		// change the value

		l.set(0, "saurabh");
		System.out.println(l);
		
		// for loop
		for(int i=1; i<l.size(); i++) {
			
			System.out.println(l.get(i));
		}
		
// add all
		
		LinkedList ls=new LinkedList();
		
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("D");
		ls.add("E");
		ls.add("F");
		System.out.println(ls);
		

		
		LinkedList a=new LinkedList<>();
		a.add("X");
	a.add("Y");
	
	System.out.println(a);
		
	a.add(ls);
		System.out.println(a);
	// stack and queue is also the implementation of linkedList	
LinkedList ld=new LinkedList();
		
		ld.add("X");
		ld.add("Y");
		ld.add("Z");
		ld.add("J");
		ld.add("k");
		ld.add("j");
		System.out.println(ld);
		
		ld.addFirst("E");// add first element 
		ld.addLast("mohan");
		System.out.println(ld);
		
		
		System.out.println(ld.getFirst());//get first element
		System.out.println(ld.getLast());// getLast element 
		
	System.out.println(ld.removeFirst());// remove first element 	
		System.out.println(ld.removeLast());
		
		System.out.println(ld);
		
	}

}
