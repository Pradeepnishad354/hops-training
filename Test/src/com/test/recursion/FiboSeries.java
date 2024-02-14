package com.test.recursion;

public class FiboSeries {
	
	static	int a=0;
	static	int b=1;
	static	int c=0;
	
	public static void main(String[] args) {
	
			
			 

		fiboSeries(10-2);
		
	}
	
	public static  void fiboSeries(int num) {
		
		       
		
		if(num>0) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fiboSeries(num-1);
		    
		}
		
		
	
		
		
		
		
		
				
		
	}

}
