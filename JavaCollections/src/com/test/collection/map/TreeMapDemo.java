package com.test.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		// sorting the map on the basis of key
		
		TreeMap<Integer,String> t=new TreeMap<>();
		
		t.put(3,"A");
		t.put(5, "v");
		t.put(2,"b");
		
		t.put(2, "mahadev");
		System.out.println(t);
		
		
		for(Map.Entry  a:t.entrySet()) {
			
			System.out.println(a.getKey()+" "+a.getValue());
		}
		
	}

}
