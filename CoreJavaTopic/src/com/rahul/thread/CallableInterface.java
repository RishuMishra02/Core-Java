package com.rahul.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class ThreadTask1 implements Callable<Result> {
	
	public Result call()throws Exception {
		Result resoponse = new Result();
		resoponse.code = 525;
		resoponse.message = "Hi This Rahul";
		resoponse.show();
		return resoponse;
	}
}

class Result {
	public int code;
	public String message;

	public void show() {
		System.out.println("Rahul");
	}
}

public class CallableInterface {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(1);
		ThreadTask1 task = new ThreadTask1();
		Future<Result> resultObject = executor.submit(task);
		Result result = null;
		try {
			// get method will be blocked until the Thread doesn't complete it work and
			// return a result
			result = resultObject.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result.code + " " + result.message);
		executor.shutdown();
	}
}
