package com.test;

import java.util.HashSet;

public class MissingElement {
	public static void main(String[] args) {
		
		
		int arr[]= {1,3,4,6,7,9};
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		
//		for(int a:arr) {
//			
//			
//			set.add(a);
//			
//		}
		
		for(int i=0; i<arr.length; i++) {
			
		//int a=	
		
		set.add(arr[i]);
		}
			for(int i=0; i<9; i++) {
				if(!set.contains(i)) {
					
					System.out.println(i);
				}	
			}
			
			
		}
		
	}


