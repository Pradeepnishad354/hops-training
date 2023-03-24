package com.example;

public class star12 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		int a=6;
		int a1=9;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<=n-i; j++) {
				
				if(i%2==0) {
					
					System.out.print(a--);
				}else {
					System.out.print(a1--);
				}
			}System.out.println();
			
		for(int k=1; k<=i; k++) {
			
			System.out.print(" ");
		}
		
		}
	
		
		
	}

}
