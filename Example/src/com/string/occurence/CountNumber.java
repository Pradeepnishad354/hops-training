package com.string.occurence;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {

		int count = 0;

	 	Scanner sc = new Scanner(System.in);
		System.out.println("enter number  digit");
		int num = sc.nextInt();
		while (num > 0) {

			num = num / 10;

			count++;

		}

		System.out.println("number of digit count   " + count);
	}

}
