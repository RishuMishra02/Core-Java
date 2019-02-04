package com.rahul.thread;

class Rishu implements Runnable {
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();

	}

	synchronized public void method1() {
		System.out.println(Thread.currentThread().getName() + " Method 1 started");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Method 1 ended");
	}

	synchronized public void method2() {
		System.out.println(Thread.currentThread().getName() + " Method 2 started");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Method 2 ended");
	}

}

public class SynchronizedMethod {
	public static void main(String[] args) throws InterruptedException {
		Rishu rishu = new Rishu();
		Thread rishuThread1 = new Thread(rishu, "Thread-1");
		Thread rishuThread2 = new Thread(rishu, "Thread-2");

		/*
		 * Rishu rishu = new Rishu(); Thread rishuThread1 = new
		 * Thread(rishu,"rishuThread1"); Thread rishuThread2 = new
		 * Thread(rishu,"rishuThread2");
		 */
		// rishuThread1.setDaemon(true);

		rishuThread1.start();

		// System.out.println(rishuThread1.isAlive());
		// System.out.println(rishuThread1.isDaemon());

		// rishuThread1.join();
		Thread.sleep(010);
		rishuThread2.start();

	}
}