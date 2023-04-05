package com.test.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		// insertion order is preserve
		LinkedHashMap<String, Integer> l = new LinkedHashMap<>();

		l.put("aava", 3000);
		l.put("spring", 4000);
		l.put("hibernate", 2000);
//		l.put(null, null);
		System.out.println(l);

		
		// sorting the Map on the basis of value 
		Set entryset = l.entrySet();
		
		
		List<Entry<String,Integer>> al=new ArrayList<>(entryset);
		
		
		Collections.sort(al, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Map.Entry<String,Integer> b:al) {
			
			System.out.println(b.getKey()+" "+ b.getValue());
		}
	}
}
