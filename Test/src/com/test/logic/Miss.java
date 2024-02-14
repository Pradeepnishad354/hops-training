package com.test.logic;

import java.util.HashSet;

public class Miss {
	public static void main(String[] args) {
		
		
		int arr[]= {0,1,2,5,7,9};
		
		
		HashSet<Integer> set=new HashSet<Integer>()
;
		
		for(Integer s:arr) {
			
			set.add(s);
		}
		
		for(int i=0; i<9; i++) {
			
			if(!set.contains(i)) {
				
				System.out.println(i);
			}
		}
	}

}
