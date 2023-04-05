package com.test.thread;

public class YieldMethodDemo extends Thread{

	
	public void run() {
		Thread.yield();
		for(int i=1; i<=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
	
	
	public static void main(String[] args) {
		
		YieldMethodDemo y = new YieldMethodDemo();
		
		y.start();
		//Thread.yield();// if you want main method to stop and provide other thread for execution
		
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
		
		
	}
}
