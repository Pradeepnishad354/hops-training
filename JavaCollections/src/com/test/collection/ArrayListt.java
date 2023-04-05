package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListt {

	public static void main(String[] args) {
		
		
ArrayList al=new ArrayList();




ArrayList<String> al2=new ArrayList<>();


		al.add("pradeep");
		al.add("amit");
		al.add(12);
		al.add("mahadev");
		
		System.out.println(al);
		
		//iterate the array 
//		for(Object a :al) {
//			
//			System.out.println(a);
//		}
		// remove the element 
//		al.remove(0);
//		System.out.println(al);
//		
		
	
		// insert a new element
//		al.add(1,100);
//		System.out.println(al);
//		
		//Retrieve the specific  element
		
		System.out.println(al.get(2));
		
		
		//change element replace 
		al.set(1,"rohan");
		System.out.println(al);
		
		// contains element 
		
		System.out.println(al.contains("pradeep"));
		
		// check is empty
		
		System.out.println(al.isEmpty());
		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		//1.for loop
		for(int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		
		//2.for each loop
		System.out.println("===for each loop===");
		for(Object  i: al) {
			System.out.println(i);
			
			
		}
		//3.iterator() traverse  forward direction
		System.out.println("Reading element using iterator method ");
	Iterator itr=	al.iterator();
	
	while(itr.hasNext()) {
		
		Object n = itr.next();//printing element and move to next 
		
		System.out.println(n);
	}
		
	// add all the element of a collection into another collection
	System.out.println("add all the elment into a collection ");
	
	ArrayList al1=new ArrayList<>();
	
	al1.addAll(al);
	System.out.println(al1);
	
	// remove all the element 
	System.out.println("remove all the element ");
	al1.removeAll(al);
	
	System.out.println("after remove :"+al1);
	
	
	//sort the element-- collection.sort() 
	
	ArrayList arr= new ArrayList();
	
	arr.add("mahadev");
	arr.add("saurabh");
	arr.add("pritesh");
	arr.add("jay");
	arr.add("amit");
	
	System.out.println("element in the array list "+arr);
	
	Collections.sort(arr);
	
	System.out.println("after the sorting the element "+arr);
	
	// revers order 
	Collections.sort(arr,Collections.reverseOrder());
	
	System.out.println("elements are sorting in reverse order "+arr);
		
	//shuffling - collections.shuffle
	System.out.println("++++++++++++++++++++++++++++++++++++");
	Collections.shuffle(arr);
	System.out.println("elements are shuffling "+arr);
	
	
// using listIterator for traverse the araylist
	
	System.out.println("travesr using list iterator =======");
	ListIterator n = al.listIterator();
	
	while(n.hasNext()) {
		
		System.out.println(n.next()); 
	}
	
	
	
	// using list iterator for previous traverse
	
	System.out.println("previous traverse +++++++++++");

	while(n.hasPrevious()) {
		System.out.println(n.previous());
	}
	
	
	
	}
	

	
	
	

}
