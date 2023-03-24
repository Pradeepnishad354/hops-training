package com.string.occurence;

public class SumNumber {
	public static void main(String[] args) {

		int n = 10;

		SumNumber number = new SumNumber();
		int n1 = number.calculate(n);
		System.out.println(n1);

	}

	public int calculate(int n) {
		if (n == 0) {

			return 0;
		}

		return n + calculate(n - 1);
	}
}
