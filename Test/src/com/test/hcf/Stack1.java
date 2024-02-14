package com.test.hcf;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		
		
		Stack<String> stk= new Stack<>();  
		// pushing elements into Stack  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango");  
		stk.push("Orange");  
		System.out.println("Stack: " + stk);  
		// Access element from the top of the stack  
		String fruits = stk.peek();  
		
		int search = stk.search("Grapes");
		
		System.out.println(search);
		//prints stack  
		System.out.println("Element at top: " + fruits);  
	}

}
