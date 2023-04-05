package com.test.thread;

public class ThreadInterruptedDemo2 extends Thread{
	
	public void run() {
		
		System.out.println("A "+Thread.interrupted());//true-> false
		System.out.println(Thread.currentThread().isInterrupted());
		try {
		for(int i=1; i<=5; i++) {
			
			System.out.println(i);
			
			Thread.sleep(1000);
			System.out.println("B"+Thread.interrupted());
		}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		
		
		
		ThreadInterruptedDemo2 t = new ThreadInterruptedDemo2();
		t.start();
		t.interrupt();
	}

}
