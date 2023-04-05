package com.test.synchronization;


// example of static synchronization 
class BookTheaterSeat2 {

	static int total_seat = 20;

	static synchronized void bookSeat(int seat) {

		if (total_seat >= seat) {

			System.out.println("seat book succesfully :" + seat);
			total_seat = total_seat - seat;
			System.out.println("seat left : " + total_seat);
		} else {

			System.out.println("sorry seat are not available");
			System.out.println("left seat : " + total_seat);
		}

	}
}

class MyThread1 extends Thread {
	BookTheaterSeat2 b;
	int seat;

	MyThread1(BookTheaterSeat2 b, int seat) {

		this.b = b;
		this.seat = seat;
	}

	public void run() {

		b.bookSeat(seat);
	}

}

class MyThread2 extends Thread {

	BookTheaterSeat2 b;
	int seat;

	public MyThread2(BookTheaterSeat2 b, int seat) {

		this.b = b;
		this.seat = seat;

	}

	public void run() {

		b.bookSeat(seat);
	}
}

public class MovieBookApp2 {
	public static void main(String[] args) {
		
		//create object first
		BookTheaterSeat2 b1 = new BookTheaterSeat2();

		MyThread1 t1 = new MyThread1(b1, 6);
		t1.start();
		MyThread1 t2 = new MyThread1(b1, 7);
		t2.start();

		// creating multiple object of BookTheaterSeat

		BookTheaterSeat2 b2 = new BookTheaterSeat2();//lock is applied for class level 
		MyThread2 t3 = new MyThread2(b2, 8);

		t3.start();
		MyThread2 t4 = new MyThread2(b2, 6);
		t4.start();

	}

}
