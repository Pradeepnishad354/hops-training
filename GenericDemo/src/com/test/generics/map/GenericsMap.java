package com.test.generics.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericsMap {
	public static void main(String[] args) {
		
		
		Map<String,Integer> m=new HashMap<>();
		
		m.put("kjava",200);
		m.put("spring",20063);
		m.put("hibernate",2007);
	
		System.out.println(m);
		
	Iterator<String> itr = m.keySet().iterator();
	while(itr.hasNext()) {
		String next = itr.next();
		System.out.println(next);
		//Integer integer = m.get(next);
	}
		Iterator<Integer> iterator = m.values().iterator();
		
		while(iterator.hasNext()) {
			
			Integer next2 = iterator.next();
			System.out.println(next2);
		}
	}
	}


