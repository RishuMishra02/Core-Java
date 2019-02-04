package com.rahul.thread;

class ThreadTask implements Runnable{
	public void run() {
		System.out.println("Rahul  Mishra");
	//	System.out.println("Current Thread Name:" +Thread.currentThread().getName()); // Check Start( )Method
	}
}

public class RunnableInterface extends ThreadTask{
	public static void main(String[] args) throws InterruptedException {
		//System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
		ThreadTask task = new ThreadTask();
		Thread th= new Thread(task);
		th.start();
	
	}
}



