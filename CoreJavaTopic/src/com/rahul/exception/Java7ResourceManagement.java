package com.rahul.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
public class Java7ResourceManagement implements AutoCloseable{
	
	@Override
	public void close() throws Exception {
		System.out.println("Closed Resource");
	}

	public void show() {
		System.out.println("Start method doing it ");
	}
	
	public static void main(String[] args) throws Exception {
		
		try (Java7ResourceManagement reso =new Java7ResourceManagement())
				{		reso.show();
		} 
	}}


	*/	
	
public class Java7ResourceManagement implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closed Resource");

	}
	Java7ResourceManagement(){
		System.out.println("Auto");
	}
	public static void show() {
		System.out.println("Method is call");
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\npkey.txt"));

		try (BufferedReader br1 = br) {
			show();
			System.out.println(br1.readLine());
		}
	}
	
}