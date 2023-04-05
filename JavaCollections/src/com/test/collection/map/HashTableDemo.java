package com.test.collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		
		
	//	Hashtable h = new Hashtable(); capacity is 11 and load factor is 0.75
		
		Hashtable<Integer,String> h = new Hashtable();
		
		h.put(1,"pradeep");
		h.put(2,"amit");
		h.put(4,"sumit");
	//	h.put(5,null);// null pointer exception
		h.put(6,"pritesh");
//		h.put(null, "g");// null pointer exception
		
		System.out.println(h);
		
		
		System.out.println("value"+h.get(6));
		
		System.out.println(h.keySet());//key
		
		System.out.println(h.values());// values 
		
		
		for(int a:h.keySet()) {
			
			System.out.println(a +" "+h.get(a));
			
		}
		
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		for( Map.Entry<Integer,String> i :h.entrySet()) {
			
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
		///  using iterator()
	Set<Entry<Integer, String>> entry = h.entrySet();
	Iterator<Entry<Integer, String>> itr = entry.iterator();
	
	while(itr.hasNext()) {
		
		Entry<Integer, String> n = itr.next();
		
		System.out.println(n.getKey()+" "+ n.getValue());
	}
	
		
	}

}
