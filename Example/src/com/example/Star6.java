package com.example;

import java.util.Scanner;

public class Star6 {
	public static void main(String[] args) {
//		int n=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row"); 
		int n = sc.nextInt();
		for(int i=1;i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
				for(int k=(n*2)+1; k>(i*2); k--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}


