package com.test.recursion;

public class FactorialRecursion {
	
	static int fact;
	
	public static void main(String[] args) {
		
		int factNum = factNum(5);
		
		System.out.println(factNum);
		
	}
	
	public static int factNum(int num) {
		
		if(num==0 ||num==1) {
			
			return 1;
			
		}else {
			
			return  num *factNum(num-1);
		}
		
		
		
		
		
	}

}
