package com.example.star;

public class PrintNumber2 {

	public static void main(String[] args) {
		int n = 10;
		int a = 1;
		PrintNumber2 p = new PrintNumber2();
		int p1 = p.printNumber(n);
		System.out.println(p1);

	}

	public int printNumber(int n) {

		if (1 > n) {

			return 0;
		}

		return 1 + printNumber(n - 1);
	}
}