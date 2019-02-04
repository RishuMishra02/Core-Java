package com.rahul.collection;
import java.util.concurrent.*;

public class ConcurrentHashMapTest {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> conHash = new ConcurrentHashMap<>();
		conHash.put(1, "Rahul");
		System.out.println(conHash);
		synchronized (conHash) {
			if (!conHash.containsKey(2))
				conHash.put(2, "Ri");
			else {
				conHash.get(2);

			}
			System.out.println(conHash);
		}
		/*
		 * System.out.println("putIfAbsent"+conHash.putIfAbsent(1, "value"));
		 * System.out.println(conHash);
		 */
	}
}
