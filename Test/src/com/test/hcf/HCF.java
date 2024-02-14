package com.test.hcf;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any two number");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int g=0;
		
		for(int i=1; i<=a; i++) {
			
			if(a%i==0 &&b%i==0) {
				g=i;
			}
			
		}
		System.out.println("hcf"+g);
	}

}
