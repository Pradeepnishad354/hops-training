package com.example.star;

import java.util.Scanner;

public class S8 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=n-1; i++) {
			
			for(int j=1; j<=n-i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
