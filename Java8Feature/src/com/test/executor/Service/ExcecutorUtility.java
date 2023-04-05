package com.test.executor.Service;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/// executor service 
class Service implements Runnable {

	int i;

	public Service(int i) {

		this.i = i;
	}

	@Override
	public void run() {

		System.out.println(i + "  ");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}

public class ExcecutorUtility {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newFixedThreadPool(5);

		System.out.println(new Date());

		for (int i = 0; i < 25; i++) {

			ex.execute(new Service(i));
		}
		ex.shutdown();
		try {
			ex.awaitTermination(10, TimeUnit.SECONDS);// wait till here
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(new Date());
	}

}
