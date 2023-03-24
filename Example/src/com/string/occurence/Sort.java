package com.string.occurence;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int a[] = {7 , 5, 8, 1, 4, 9, 11 };

		for (int i = 0; i <= a.length ; i++) {

			for (int j = i+1;  j <=a.length- 1; j++) {

				if(a[i]>a[j]) {
					
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				
//				if (a[j] > a[j+1]) {
//
//					int temp;
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
