package com.test.hcf;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {
	
	
	public static void main(String[] args) {
		
		HashMap<String ,Integer> map=new HashMap<String, Integer>();
		
		
		map.put("math",80);
		map.put("java", 86);
		map.put("spring", 75);
		map.put("hibernate", 78);
		map.put("microservices", 70);
		map.put("react", 68);
		
		System.out.println(map);
		 Map<String, Integer> hm1 = sortByValue(map);
		
		for(Map.Entry<String, Integer> m:hm1.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());	
			
		}
		
		
//		TreeMap<String,Integer> tree=new TreeMap<String, Integer>(map);
//		
//		System.out.println(tree);
	}
	
	
	
	
public static HashMap<String ,Integer> sortByValue(HashMap<String ,Integer> hm){
	
	
	List<Map.Entry<String, Integer> > list =
            new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
	
	Collections.sort(list ,new Comparator<Map.Entry<String, Integer>>() {

		

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		
			return o1.getValue().compareTo(o2.getValue());
		}
	});
	
	// put the value of hashmap
	
	HashMap<String, Integer> temp=new LinkedHashMap<String, Integer>();
	
	for(Map.Entry<String,Integer> aa:list) {
		
		temp.put(aa.getKey(),aa.getValue());
	}
	
	
	
	
	
	return temp;
		
		
		
	}
}
