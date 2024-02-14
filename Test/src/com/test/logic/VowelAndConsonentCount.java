package com.test.logic;

public class VowelAndConsonentCount {
	public static void main(String[] args) {
		
		
		String str="hello how are you";
		
		
		char[] c = str.toCharArray();
		int countVowel=0;
		
		for(int i=0; i<c.length; i++) {
			
		
			char c1 = str.charAt(i);
			
			switch(c1) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				countVowel++;
				
			}
			
			
			
		}
		System.out.println(countVowel);
	}

}
