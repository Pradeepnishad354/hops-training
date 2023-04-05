package com.test.thread;

public class SleepDemo3  extends  Thread{
	
	public void run() {
		try {
		for(int i=1; i<=6; i++) {
			
			Thread.sleep(1000);
			System.out.println(i+": "+Thread.currentThread().getName());
			
			System.out.println();
		}
		}catch(InterruptedException e) {
			System.out.println(e);
			
			
		}
	}
	public static void main(String[] args) {
		
		
		SleepDemo3 s = new SleepDemo3();
		
		//s.start();
		s.run();
		SleepDemo3 s1 = new SleepDemo3();
		s1.run();
		//s1.start();
	}

}
