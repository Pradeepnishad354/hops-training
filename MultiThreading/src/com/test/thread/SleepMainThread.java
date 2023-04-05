package com.test.thread;

public class SleepMainThread {
	
	public static void main(String[] args) {
		try {
		for(int i=1; i<=6; i++) {
			
			Thread.sleep(1000);
			System.out.println("main thread sleep for 1 sec"+i);
		}
		}catch(InterruptedException e) {
			System.out.println(e);
			
			
		}
		
		
		
	}

}
