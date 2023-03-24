package com.string.occurence;

import java.util.Arrays;

public class AB2 {
	public static void main(String[] args) {
		
		
		int arr[] = {4,1,4,7,9};
		int a[]=new int[arr.length];
		int count=0;
		for(int i=arr.length-1; i>=0; i--) {
	 		
			
			a[count]=arr[i];
			
			count++;
		}
		System.out.println(Arrays.toString(a));
	}
     
}
