package com.string.occurence;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
 		
		PrintNumber p = new PrintNumber();

		p.printNum(n);
	}

	public int printNum(int n) {

		if(n==0) {
			return 0;
		}
		
System.out.println(n);
	return printNum(n-1);		
		

	}
}
