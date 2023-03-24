package com.string.occurence;

public class PrintNumber2 {

	public static void main(String[] args) {
		 
		
		PrintNumber2 p = new PrintNumber2();
   
         p.printNumber(10);

  
	}

	void printNumber(int n) {

		if (n == 0) {

			return ;
		}
		
		 
		printNumber(n - 1);
		 System.out.println(n);
	}
}
