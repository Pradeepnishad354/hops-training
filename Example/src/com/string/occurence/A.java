package com.string.occurence;

public class A {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.countNumber(99988));
		
	//	System.out.println(String.valueOf(999999).length());

	} 

	public int countNumber(int n) {

		if (n == 0) {
			return 0;

		} else {

			return 1 + countNumber(n / 10);
		}
	}
}
