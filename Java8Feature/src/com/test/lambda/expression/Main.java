package com.test.lambda.expression;

@FunctionalInterface
interface MyInter {

	//no args
	public abstract void say();
}

class Main {
	public static void main(String[] args) {

		// Anonymous
//		MyInter i1 = new MyInter() {
//
//			@Override
//			public void say() {
//				System.out.println("anonymous inner class ");
//
//			}
//		};
//		i1.say();
//		

		// using lambda expression

		MyInter i = () -> {
			System.out.println("this is the first example of lambda expression");

		};

		i.say();

		// sum

		Sum s = (a, b) -> {

			return a + b;
		};
		System.out.println(s.sum(10, 20));
		
		System.out.println(s.sum(30, 20));
		
		
		
		// Sum without return 
		
		Sum s1=(a,b)->
			
			a+b;
		System.out.println(s1.sum(10, 60));

		
		
		
		
		
		// length
		
		Len l=(str)->
			
			str.length();
			
			System.out.println("the length of the string "+l.Leng("mahadev"));
			
		

	}

}
