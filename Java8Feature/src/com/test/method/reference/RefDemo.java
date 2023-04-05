package com.test.method.reference;

public class RefDemo {

	public static void main(String[] args) {

//		WorkInter w = () -> {
//			System.out.println("this is mwthod reference example");
//		};
//
//		w.doStuff();

		// static method reference
		// className::methodName

		WorkInter w = Stuff::doStuff;

		w.doStuff();

		Runnable r = Stuff::doThread;

		Thread t = new Thread(r);

		t.start();
		
		// refering non static method

		// obj::methodName

		Stuff s = new Stuff();

		Runnable r2 = s::printNumber;

		Thread t2 = new Thread(r2);
		t2.start();

	}

}
