package com.example.star;

import java.util.Scanner;

public class Star8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n * 2 - (i * 2 - 1); j++) {

				if (i == 1 || j == 1 || i == n || j == n * 2 - (i * 2 - 1)) {

					System.out.print("* ");

				} else {
					
					
					System.out.print("+ ");
				}
			}

			System.out.println();
		}

	}

}
