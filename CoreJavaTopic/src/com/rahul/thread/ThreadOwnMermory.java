package com.rahul.thread;

class OwnMemory extends Thread{
public void run() {
	System.out.println("Run method is call");
	/* try {
         Thread.sleep(2000);
  } catch (InterruptedException e) {
         e.printStackTrace();
  }*/
	 System.out.println("Run method with sleep call");
}
}


public class ThreadOwnMermory{
	public static void method() throws InterruptedException{
		System.out.println("method is call");
	}
	public static void main(String[] args) throws InterruptedException {
	Thread th= new Thread(new OwnMemory(),"Thread=1");
	Thread.yield();
	System.out.println(Thread.currentThread().getName() + " has started");
	method();
	Thread.sleep(1000);  //start sleep ho gaya .....main start and end then start method will executed
	
	//th.setDaemon(true);
	
	th.setPriority(Thread.MAX_PRIORITY);
	th.start();
	Thread.sleep(4000);  //main end is sleep 

	System.out.println(Thread.currentThread().getName() +  " has ended");

	}
	
	


}
