package com.rahul.thread;



public class ExtendsClass extends Thread {

	@Override
	public void run() {
		System.out.println("Rahul");
	}
	public static void main(String[] args) {
		
	
		ExtendsClass ext = new ExtendsClass();
		
		Thread th = new Thread(ext);
		th.start();
	}

}