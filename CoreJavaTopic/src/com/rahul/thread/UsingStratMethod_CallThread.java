package com.rahul.thread;
class StartMethod implements Runnable{

	@Override
	public void run() {
	System.out.println("is run() Method ");	
	System.out.println("Current Thread Name :"+Thread.currentThread().getName());
	
	}
	
}
public class UsingStratMethod_CallThread extends StartMethod{
public static void main(String[] args) {
	System.out.println(""+Thread.currentThread().getName());
	UsingStratMethod_CallThread start = new UsingStratMethod_CallThread();
	Thread thread = new Thread(start);
	thread.start();
}
}
