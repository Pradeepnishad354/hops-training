package com.test.logic;

public class P {
	
	public static void main(String[] args) {
		
		
		int p=8;
		int temp = 0;
		
		for(int i=2; i<p; i++) {
			
			if(p%i==0) {
				
				temp++;
			}
		}
		if(temp>0) {
			
			System.out.println("np");
		}else {
			System.out.println("p");
		}
	}

}
