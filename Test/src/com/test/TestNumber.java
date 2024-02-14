package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 7, 1, 3, 4, 4, 5, 6, 7 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		

		for (Integer num : arr) {

			map.put(num,map.getOrDefault(num,0)+1);
		}

		
	for(Map.Entry<Integer,Integer> m:map.entrySet()) {
		
		
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}

}
