package com.rahul.thread;

class RunMethod implements Runnable {
	public void run() {
		System.out.println(" in Run ()");
		System.out.println("Current Thread Name: " + Thread.currentThread().getName());
	}
}

public class UsingRunMethod_CallThread extends RunMethod {
	public static void main(String[] args) {
		System.out.println("Current Thread Name :" + Thread.currentThread().getName());
		UsingStratMethod_CallThread run = new UsingStratMethod_CallThread();
		Thread thread = new Thread(run);
		thread.run();
	}
}