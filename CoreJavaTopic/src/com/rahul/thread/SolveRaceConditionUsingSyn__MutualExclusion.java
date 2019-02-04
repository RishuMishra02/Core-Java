package com.rahul.thread;
/*class TicketBooking implements Runnable{
	int ticketsAval =1;

	@Override
	public void run() {
System.out.println("Waiting to book Ticket" + Thread.currentThread().getName());

synchronized (this) {
	if(ticketsAval>0) {
		System.out.println("Ticket Booking of " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ticketsAval --;
		System.out.println("Ticket Booked For:" + Thread.currentThread().getName());
		System.out.println("Current Ticket Aval is :" +ticketsAval);
		
	}else {
		System.out.println("Ticket Not Booked For :"+Thread.currentThread().getName());
	}
		}
	}
}
public class SolveRaceConditionUsingSyn__MutualExclusion extends TicketBooking{
public static void main(String[] args) {
	SolveRaceConditionUsingSyn__MutualExclusion mutual = new SolveRaceConditionUsingSyn__MutualExclusion();
	Thread thread1 = new Thread(mutual," Passenger-1 Thread");
	Thread thread2 = new Thread(mutual,"Passenger-2  Thread"
			+ "2");
	thread1.start();
	thread2.start();
}
}
*/


class TicketesBook implements Runnable {

	static int ticketAva = 1;

	@Override
	public void run() {
		System.out.println("Waiting to Book Ticket :" + Thread.currentThread().getName());

		synchronized (this) {

			if (ticketAva > 0) {
				System.out.println("Ticket Booking of " + ":" + Thread.currentThread().getName());
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				ticketAva--;
				System.out.println("Ticket Booked For: " + Thread.currentThread().getName());
				System.out.println("Current Ticket Ava is :" + ticketAva);
			} else {
				System.out.println("Ticket Not Booked for :" + Thread.currentThread().getName());
			}
		}
	}
}

public class SolveRaceConditionUsingSyn__MutualExclusion extends TicketesBook {
	public static void main(String[] args) {
		System.out.println("Total Avl Ticket is :" + ticketAva);

		SolveRaceConditionUsingSyn__MutualExclusion tk = new SolveRaceConditionUsingSyn__MutualExclusion();

		Thread thread1 = new Thread(tk, "Passenger-1 ");
		Thread thread2 = new Thread(tk, "Passenger-2");
		thread1.start();
		thread2.start();
	}

}
	
	


