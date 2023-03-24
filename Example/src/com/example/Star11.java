package com.example;

public class Star11 {
	
	
	public static void main(String[] args) {
		
		int n=5;
		char a='a';
		char b='a';
		
		for(int i=1; i<=n; i++) {
			
			
			for(int j=0; j<=n-i; j++) {
				
				if(i%2==0) {
					
					System.out.print(a++ + " ");
				}else {
					
					System.out.print(b++ + " ");
				}
				
			}System.out.println();
			
			for(int k=0; k<i*2; k++) {
				
				System.out.print(" ");
			}
		}
		
		
		
	}

}
