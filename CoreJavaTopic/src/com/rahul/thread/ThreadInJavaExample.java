package com.rahul.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadInJavaExample {
  public static void main(String[] args) throws InterruptedException {
    ImplementsRunnable rc = new ImplementsRunnable();//rc is Runnable object
    
    // Case 1: Thread class is runner for rc.
    Thread t1 = new Thread(rc);
    t1.start();
    Thread.sleep(10000);
    
    // Case 2: Executors used as the runner for rc. 
    ExecutorService es = Executors.newCachedThreadPool();
    es.execute(rc);
    
    //Case 3: Execution as instance method, executed in main thread context
    rc.run();
    
  }

}

class ImplementsRunnable implements Runnable {
  private int count = 0;
  public void run() {
    count++;
    System.out.println("ImplementsRunnable Count " + count);
  }
}