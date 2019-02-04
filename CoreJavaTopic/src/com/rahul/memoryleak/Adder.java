package com.rahul.memoryleak;

public class Adder {
	public long addIncremental(long l) {
		long sum = 0L;
		sum = sum + l;
		return sum;
	}

	public static void main(String[] args)
	{
		Adder adder = new Adder();
	for(long i=0  ;i<10;i++) 
	{
		adder.addIncremental(i);
		}
	}
}