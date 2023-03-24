package com.string.occurence;

public class StringOccurencesCount {
	public static void main(String[] args) {

		String s = "praddaaddwheep";

		char search = 'a';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == search) {

		 		count++;
				System.out.println(i);
			}

		}
		System.out.println("the charactor  " + search + " " + count + " times ");
	}

}
