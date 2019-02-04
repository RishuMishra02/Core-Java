package com.rahul.thread;

class A1 implements Runnable {
	
	
	public void run() {
		synchronized (String.class) {
			System.out.println(Thread.currentThread().getName() + " has equired lock"
					+ "on String class Waiting for Object class");
		}
		synchronized (Object.class) {
			System.out.println(Thread.currentThread().getName() + " has equired Lock on Object Class");
		}
		System.out.println(Thread.currentThread().getName() + " has Ended");
	}
}
class B1 extends Thread{
	public void run() {
		synchronized (Object.class) {
			System.out.println(Thread.currentThread().getName()+" has equired lock"+
		" on Object class waiting for String  class");
					
		}
		synchronized (String.class) {
			System.out.println(Thread.currentThread().getName()+" has aquired Lock on String class");
		}
		System.out.println(Thread.currentThread().getName()+" has Ended");
		}
	}
public class Deadlock_Avoid_UsingJoin {
public static void main(String[] args)throws InterruptedException {
	Thread a1Thread = new Thread(new A1(),"Thread-1");
	Thread b1Thread = new Thread(new B1(),"Thread-2");
	a1Thread.start();
	a1Thread.join();
	b1Thread.start();
	
}
}
