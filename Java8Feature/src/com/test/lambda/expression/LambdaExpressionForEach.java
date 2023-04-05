package com.test.lambda.expression;

import java.util.ArrayList;

public class LambdaExpressionForEach {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();
		a.add("mahadev");
		a.add("amit");
		a.add("saurabh");
		a.add("pritesh");

		a.forEach((n) -> System.out.println(n));
	}

}
