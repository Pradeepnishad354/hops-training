package com.test.hcf;

import java.util.Scanner;
import java.util.Stack;

public class BracketVerification {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the baracketlike {} () []");
		String s = sc.nextLine();
		//String s="(){}[]";
		boolean validateStringBracket = validateStringBracket(s);
		
		System.out.println(validateStringBracket);
	}
	public static boolean validateStringBracket(String s) {
		
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(ch=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}else {
					return false;
				}
			}
			
			
			else if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();				
			}else {
				return false;
			}
			
		}
			
			else if(ch==']') {
			
			if(stack.peek()=='[') {
				
				stack.pop();
			}else {
				return false;
			}
			
		}else {
			stack.push(ch);
		}
			
	}
		
		
		
	if(stack.size()==0) {
		return true;
	}
	return false;
	}
	
	
	
}
