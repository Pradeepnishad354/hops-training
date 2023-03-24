package com.example;

import java.util.Scanner;

public class Start10 {

	public static void main(String[] args) {

		int s1 = 1;
		int s2 = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of row ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i<n; i++) {
			
			for (int k = 0; k <i; k++) {

				System.out.print("  ");
			}

			for (int j = 0; j <n-i; j++) {

				if (i % 2 == 0) {

					System.out.print(s1+++" ");

				} else {
					System.out.print(s2+++" ");
				}
				
			}
			System.out.println();

			
		}

	}

}
