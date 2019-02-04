package com.rahul.thread;

class A implements Runnable{
	public void run() {
		synchronized (String.class) {
			try {
				Thread.sleep(900);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" has aquired Lock" +
			" on String and Waiting to aquire Lock on Object Class  ");
			synchronized (Object.class) {
				System.out.println(Thread.currentThread().getName()+" has aquired Lock on Object Class");
			}
		}
		System.out.println(Thread.currentThread().getName()+" has Ended");
	}
}

class B extends Thread{
	public void run()  {
		synchronized (Object.class) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" has acquired Lock "
			+" on Object class and waiting for String class ");
			synchronized (String.class) {
				System.out.println(Thread.currentThread().getName()+" has aquired Lock on String Class");
			}
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" has Ended");
	}
}
public class Deadlock {
	public static void main(String[] args)throws InterruptedException {
	Thread aThread = new Thread(new A(),"Thread-1");
	Thread bThread = new Thread(new B(),"Thread-2");
	aThread.start();
	//aThread.join();   //Join Avoid the DeadLcok 
	bThread.start();
				
		
	}

}
