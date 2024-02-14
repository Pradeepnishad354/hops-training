package com.test.logic;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySort {
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {20,10,90,55,66,22};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				  int temp;
				
					if(arr[i]<arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
						
						
					}
					
					
			
			}
			  
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
