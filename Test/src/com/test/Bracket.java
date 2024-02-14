package com.test;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

	public static void main(String[] args) {

		System.out.println(bracketVerification());

	}

	public static boolean bracketVerification() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your bracket");

		String sc = scanner.nextLine();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < sc.length(); i++) {

			char ch = sc.charAt(i);

			if (ch == '}') {

				if (stack.peek() == '{') {

					stack.pop();

				} else {

					return false;
				}
			}

			else if (ch == '(') {
				if (stack.peek() == ')') {

					stack.pop();
				} else {

					return false;
				}
			}

			else if (ch == '[') {
				if (stack.peek() == ']') {

					stack.pop();
				} else {

					return false;
				}
				
			} else {

				stack.push(ch);
			}

		}

		if (stack.size() == 0) {
			return true;
		}
		return false;

	}
}
