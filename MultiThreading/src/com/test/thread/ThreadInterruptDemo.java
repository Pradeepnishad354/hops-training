package com.test.thread;

public class ThreadInterruptDemo extends Thread {
	
	public void run() {
		
		try {
		for(int i=1; i<=4; i++) {
			
			
			System.out.println(i);
			Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
			
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadInterruptDemo t = new ThreadInterruptDemo();
		t.start();
		t.interrupt();
	}

}
