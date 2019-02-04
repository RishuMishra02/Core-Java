package com.rahul.thread;

class OddEven implements Runnable {
	int maxNumber = 10;
	int remainder;
	static int number = 1;

	static Object lock = new Object();

	OddEven(int remainder) {
		this.remainder = remainder;
	}

	public void run() {
		while (number < maxNumber) {
			synchronized (lock) {
				while (number % 2 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " Number is : " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}

public class Test_Even_Odd {
	public static void main(String[] args) {
		OddEven oddeven = new OddEven(1);
		OddEven even = new OddEven(0);

		Thread oddThread = new Thread(oddeven, "Odd");
		Thread evenThread = new Thread(even, "Even");
		oddThread.start();
		evenThread.start();
	}
}






/*class OddEven implements Runnable {
	int maxNumber=10;	
	static int number=1;
	int remainder;
	static Object lock=new Object();

	
	OddEven(int remainder){
		this.remainder=remainder;
	}
	
	public void run() {
		while (number < maxNumber) {
			synchronized (lock) {
				while (number % 2 != remainder) {

					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;

				lock.notifyAll();
			}
		}
	}
}
public class Test_Even_Odd {
public static void main(String[] args) {
	OddEven odd= new OddEven(1);
	OddEven even= new OddEven(0);

	Thread oddThread = new Thread(odd,"Odd Number");
	Thread evenThread = new Thread(even,"Even Number");
	oddThread.start();
	evenThread.start();
}
}*/
