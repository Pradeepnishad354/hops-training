package com.test.logic;

public class Test {
	
	
	public static void main(String[] args) {
		
		int arr[]= {20,40,60,80,100,50};
		
		
		int highest=Integer.MIN_VALUE;
		
		int secondHighest=Integer.MIN_VALUE;
		
		
		for(int num:arr) {
			
			if(num>highest) {
				
				
				secondHighest=highest;
				highest=num;
			}else if(num>secondHighest) {
				
				secondHighest=num;
			}
			
			
		}
		
		System.out.println(""+secondHighest);
		
	}
	
	
	
	

}
