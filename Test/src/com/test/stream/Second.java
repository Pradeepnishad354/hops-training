package com.test.stream;

public class Second {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 90, 30, 100 };

		int highest = Integer.MIN_VALUE;

		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > highest) {

				secondHighest = highest;

				highest = num;

			}

			else if (num > secondHighest) {

				highest = num;

			}
		}

		System.out.println(secondHighest);

	}

}
