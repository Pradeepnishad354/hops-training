package com.test.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> m=new HashMap<>();
		
		m.put(1,"pritesh");
		m.put(2, "rohit");
		m.put(3,"surendra");
		m.put(null,"surendra");
		System.out.println(m);
		
		//get
		System.out.println(m.get(1));
		
		//contains 
		
		System.out.println(m.containsKey(1));//true
		System.out.println(m.containsValue("pritesh"));//true
//	m.remove(3);
//	System.out.println(m); 
	
	// isEmpty()
	System.out.println(m.isEmpty());
	
	System.out.println(m.keySet());// return all the key as set
		
	System.out.println(m.values());// all the value 	
		
		
	System.out.println(m.entrySet());// return all the entries as set 
		
		// print the key and value 
		for(Object i:m.keySet()) {
			
			System.out.println(i+"  "+m.get(i));
		}
		
		// using entry interface 
		for(Map.Entry<Integer,String> a:m.entrySet()) {
			
			
			System.out.println(a.getKey()+"  "+a.getValue());
		}
		
		
		// iterator()
		
		Set e = m.entrySet();
		Iterator itr = e.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry entry = (Entry) itr.next();
			
		System.out.println(" key "+entry.getKey()+"  "+" value- "+ entry.getValue());	
			
			
		}
		
	}

}
