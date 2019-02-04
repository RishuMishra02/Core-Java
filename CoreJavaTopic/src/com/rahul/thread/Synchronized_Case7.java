package com.rahul.thread;

class Ghisu implements Runnable {
	public void run() {
		method1();
	}

synchronized public void method1() {
	System.out.println(Thread.currentThread().getName()+" Method 1 Started");
try {
	Thread.sleep(400);
}catch(InterruptedException e) {
	e.printStackTrace();
}
method2();  // start start end end

System.out.println(Thread.currentThread().getName()+" Method 1 Ended");
//method2();  // start end start end

}

synchronized public void method2(){
	System.out.println(Thread.currentThread().getName()+" Method 2 Started");
	
	try {
		Thread.sleep(500);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()+" Method 2 Ended");
	
}
}


public class Synchronized_Case7 {
public static void main(String[] args) throws InterruptedException{
	Thread ghisuThread1 = new Thread(new Ghisu(),"Thread-1");
	
	ghisuThread1.start();
			
} 



	
}

