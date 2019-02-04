package com.rahul.singletons;

public class CheckMultiThread {
	public static void main(String[] args) {
		// Thread 1
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				ThreadSafeSingletonSynchronized instance1 = ThreadSafeSingletonSynchronized.get_threadsafe();
				System.out.println("Instance 1 hash:" + instance1.hashCode());
			}
		});

		// Thread 2
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				ThreadSafeSingletonSynchronized instance2 = ThreadSafeSingletonSynchronized.get_threadsafe();
				System.out.println("Instance 2 hash:" + instance2.hashCode());
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				ThreadSafeSingletonSynchronized instance3 = ThreadSafeSingletonSynchronized.get_threadsafe();
				System.out.println("Instance 3 hash:" + instance3.hashCode());
			}
		});

		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				ThreadSafeSingletonSynchronized instance4 = ThreadSafeSingletonSynchronized.get_threadsafe();
				System.out.println("Instance 4 hash:" + instance4.hashCode());
			}
		});

		// start both the threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}