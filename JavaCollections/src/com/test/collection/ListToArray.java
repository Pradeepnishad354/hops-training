package com.test.collection;

import java.util.ArrayList;

public class ListToArray {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();

		a.add(14);
		a.add(11);
		a.add(15);
		a.add(10);
		a.add(13);

		a.add(12);

		System.out.println("element of the list"+a);
		
		
		Integer[] arr=new Integer[a.size()];
		
		// converting list to array
		a.toArray(arr);
		
		System.out.println("element of the array");
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}

}
