package com.example;

import java.util.Scanner;

public class Star7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of rows");
		int n = sc.nextInt();
// for rows 
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= (i * 2) - 1; j++) {

				if (j == 1 || j == (i * 2) - 1 || i == n)
					System.out.print("*"+" ");
				else

					System.out.print("+"+" ");
 
			}
			System.out.println();
			for (int k = n; k >= i; k--) {
				System.out.print(" "+" ");
			}

		}
	}

}
