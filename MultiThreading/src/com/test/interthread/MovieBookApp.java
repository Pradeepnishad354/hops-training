package com.test.interthread;

class TotalEarning extends Thread {

	int total = 0;

	public void run() {

		synchronized (this) { // synchronized block

			for (int i = 1; i <= 10; i++) {

				total = total + 100;
			}
			this.notify();// it notify that thread-0 have completed 
		}
	}

}

public class MovieBookApp {

	public static void main(String[] args) {

		TotalEarning te = new TotalEarning();

		te.start();
		// System.out.println("total earning " + te.total + "rs"); //problem occurs it
		// will execute main thread
		// and give output total 0;
		// we can remove this problem by synchronization block

		synchronized (te) {

			try {
				te.wait();// main thread is wait until thread-0 will not execute
				
				System.out.println("total earning : "+te.total +" Rs");
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}
