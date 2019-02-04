package com.rahul.thread;

import java.util.*;

/*import com.rahul.equals.Rahul;
class RahulPart implements Runnable  {
	boolean rishu;
	RahulPart(){
		rishu= true;
	}

	public void run() {
		
			System.out.println("2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("3");
			rishu= false;
			}
	
}
	
class MishraPart extends Thread {
	RahulPart rahul;

	MishraPart(RahulPart obj) {
		rahul = obj;
	}

	public void run() {
		while (this.rahul.rishu) {
			System.out.println("1");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("4");
		}
	}
}

public class WithoutUsing_Wait_Notify_NotifyAll_Consumer_Production {
	public static void main(String[] args) throws InterruptedException {

		RahulPart rahul =new RahulPart();
		MishraPart mis = new MishraPart(rahul);
		Thread rahulThread = new Thread(rahul,"rahulThread");
		Thread misThread = new Thread(mis,"misThread");

		misThread.start();
	//Thread.sleep(100);
		rahulThread.start();
	}
}*/

class Producer1 implements Runnable {
	boolean notnoty;
	ArrayList<Integer> list;

	Producer1() {
		notnoty = true;
		list = new ArrayList<Integer>();
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			list.add(i);
			System.out.println("Producer  is still Producing, Product : " + i);

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Producer is over, Consumer can consume.");
		
		notnoty = false;

	}
}

class Consumer1 extends Thread {
	Producer1 prod;

	Consumer1(Producer1 obj) {
		prod = obj;
	}

	public void run() {
		while (this.prod.notnoty) {
			System.out.println("BUSY SPIN ....Consumer1 waiting for Production to get over...");
		/*	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
*/
		}
		int productSize = this.prod.list.size();
		for (int i = 0; i < productSize; i++)
			System.out.println("Consumed : " + this.prod.list.remove(0) + " ");

	}

}

public class WithoutUsing_Wait_Notify_NotifyAll_Consumer_Production {
	public static void main(String[] args) {
		Producer1 prod = new Producer1();
		Consumer1 cons = new Consumer1(prod);

		Thread prodThread = new Thread(prod, "prodThread");
		Thread consThread = new Thread(cons, "consThread");

		consThread.start(); // start Consumer1 thread.
		// Thread.sleep(300); // This minor delay will ensure that Consumer1 thread
		// starts before Producer1
		// thread.
		prodThread.start(); // start Producer1 thread.

	}

}
