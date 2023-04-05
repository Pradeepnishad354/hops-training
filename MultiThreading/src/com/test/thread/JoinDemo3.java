package com.test.thread;

class Medical extends Thread{
	
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("medical start");
		System.out.println("medical completed");
	}
}

class TestDrive extends Thread{
	
	
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Test Drive start");
		
		System.out.println("Test drive complete");
	}
}


class Officer extends Thread{
	
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("officer work start");
		
		System.out.println("officer work completed");
	}
	
}

public class JoinDemo3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Medical m = new Medical();
		
		m.start();
		m.join();
		TestDrive t = new TestDrive();
		t.start();
		t.join();
		Officer o = new Officer();
		o.start();
	}

}
