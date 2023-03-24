package com.example.star;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String[] args) {

		int c, rem;
		int arm = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		
		c = n;
		
		while (n > 0) {

			rem = n % 10;
			arm = (rem * rem * rem) + arm;
			n = n / 10;

		}
		if (c == arm) {

			System.out.println("number is armstrong ");
		} else {

			System.out.println("number is not armstrong ");
		}

	}

}
