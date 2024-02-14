package com.test.logic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first array");
		String first = sc.nextLine();
		
		char[] firstArray = first.toCharArray();
		System.out.println("Enter your second array");
		String second = sc.nextLine();
		char[] secondArray = second.toCharArray();
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		
		if(Arrays.equals(firstArray, secondArray)) {
			
			System.out.println("string is anagram");
			
		}else {
			
			System.out.println("is not anagram");
		}
		
		
	}

}
