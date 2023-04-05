package com.test.lambda.expression;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		
		
		Runnable r=()->{
			
			
			for(int i=0;i<=10; i++) {
				
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t=new Thread(r);
		t.start();
	}

}
