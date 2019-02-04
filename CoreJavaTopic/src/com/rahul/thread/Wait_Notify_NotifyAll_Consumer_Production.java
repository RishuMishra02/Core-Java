package com.rahul.thread;

import java.util.*;

/*class Rahul implements Runnable {
	
	Rahul(){
		
	}
		
	public void run() {
		synchronized (this) {
			System.out.println("2");
		
		try {
			Thread.sleep(500);    //this.wait(3000) ----- > then no need to notify() method
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("3");
		this.notify();  // no need to notify  if u will give the  wait(100);
	}
}
}
class Mishra extends Thread {
	Rahul rahul;
	
	Mishra(Rahul obj){
		rahul =obj;
	}
	
	public void run() {
		synchronized (this.rahul) {
			System.out.println("1");
		
		try {
			this.rahul.wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("4");
		
	}
	}
	}
public class Wait_Notify_NotifyAll_Consumer_Production{
	public static void main(String[] args)throws InterruptedException {
		System.out.println("Main Thread start");
		Rahul rahul = new Rahul ();
		Mishra mis = new Mishra(rahul);
		Thread rahulThread = new Thread(rahul);
		Thread misThread = new Thread(mis);
		misThread.start();
		rahulThread.start();
		//rahulThread.sleep(200);
		rahulThread.join();

		System.out.println("End Main Thread");  // join ke karan last me chalega 
	}
}*/

class Producer implements Runnable {
	ArrayList<Integer> list;
	Producer(){
		list= new ArrayList<Integer>();
	}
	public void run() {
		synchronized (this) {
			for(int i =1;i<=10;i++) {
				list.add(i);
				System.out.println("Producer Produce the, Product " + i);
				try {
					Thread.sleep(400);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Producer is over, Consumer can Consume");
			this.notifyAll();
		}
	}
}

class Consumer extends Thread{
	
	Producer prod;
	
	Consumer(Producer obj){
		prod=obj;
	}
	
	
	
		public void run() {
			synchronized (this.prod) {
				System.out.println("Consumer waiting for Production to get over...");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			
			int consumerCom = this.prod.list.size();
			for(int i=0;i<consumerCom;i++) {
				System.out.println("Consumer" + this.prod.list.remove(0)+ "");
			
		}
			
			
	}
}


public class Wait_Notify_NotifyAll_Consumer_Production {
	public static void main(String[] args)throws InterruptedException{
		Producer prod = new Producer();

		Consumer cons= new Consumer(prod);
		Thread consThread = new Thread(cons,"consThread");
		Thread prodThread = new Thread(prod,"prodThread");
		consThread.start();
		Thread.sleep(400);

		prodThread.start();
	}
}









