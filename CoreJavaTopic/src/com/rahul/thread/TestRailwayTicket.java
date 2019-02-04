package com.rahul.thread;

class Ticket implements Runnable {
	int AvTicketes = 1;

	public void run() {
		System.out.println("Waiting to Book Ticket " + Thread.currentThread().getName());
		synchronized (this) {
			if (AvTicketes > 0) {
				System.out.println("Ticket  Booking of " + Thread.currentThread().getName());

				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				AvTicketes--;
				System.out.println("Ticket Booked for : " + Thread.currentThread().getName());
				System.out.println("Current Av Ticket is " + AvTicketes);
			} else {
				System.out.println("Ticket Not Booked for " + Thread.currentThread().getName());
			}
		}
	}
}

public class TestRailwayTicket extends Ticket {
	public static void main(String[] args) throws InterruptedException {

		TestRailwayTicket ticket = new TestRailwayTicket();
		Thread thread = new Thread(ticket, "Passenger-1");
		Thread thread1 = new Thread(ticket, "Passenger-2");

		thread.start();
		// Thread.sleep(1000);
		thread1.start();
	}
}
