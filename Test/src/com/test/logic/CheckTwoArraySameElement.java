package com.test.logic;

import java.util.Arrays;

public class CheckTwoArraySameElement {

	public static void main(String[] args) {
		
		
		int arr1[]= {1,2,3,4};
		int arr2[]= {4,2,3,1}
;
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			
			System.out.println("both are same ");
		}else {
			
			System.out.println("both are not same");
			
		}
		
	}
}
