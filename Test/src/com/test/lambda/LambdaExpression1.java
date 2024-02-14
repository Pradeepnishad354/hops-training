package com.test.lambda;

interface Test {

	public int draw(int a,int b);

}
// without lambda
public class LambdaExpression1 {

	public static void main(String[] args) {
		int width = 10;
//
//		Test t = new Test() {
//
//			@Override
//			public void draw() {
//
//				System.out.println("width " + width);
//
//			}
//		};
//
//		t.draw();
//	}

	
		Test t2=(a,b)->{
			
			int c;
			c=a+b;
			
			System.out.println(c);
			return c;
			
		};
		
		t2.draw(20,20);
}
}