package com.example;

import java.util.Scanner;

public class Star9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows ");

		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= (n * 2) - 1; i++) {

			for (int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			if (i < n) {
				k++;
			} else {

				k--;
			}

			System.out.println();
		}
	}

}
