package com.example.star;

public class S {
	
	public static void main(String[] args) {
	
		for(String s:args) {
			int n = Integer.parseInt(s);
			
			
			for(int i=1; i<=n; i++) {
				
				for(int j=(n*2)-1; n>=i; j--) {
					
					if( j==1||j==(i*2)-1|| i==1) {
						
						System.out.print("*");
				}else {
						System.out.print("+");
					}
					
				}
				System.out.println();
					for(int k=n; k<=i; k++) {
						System.out.print(" ");
					}
				}
				
			}
			
			
		}
		
		
		
		
	}


