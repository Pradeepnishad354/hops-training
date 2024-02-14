package com.test.logic;

public class Max {

	public static void main(String[] args) {
		
		
		int arr[]= {20,40,60,80,10};
		
		int max=arr[0];
		
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
			
		}
		System.out.println(max);
		
	}
}
