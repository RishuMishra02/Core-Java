package com.rahul.collection;

import java.util.*;

public class IdentityHashMapExample1 {
	public static void main(String[] args) {
		IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();
		HashMap<String, String> hashMap = new HashMap<>();
		
		identityHashMap.put("1", "abc");
		identityHashMap.put(new String("1"), "xyz");
		
		hashMap.put("1", "abc");
		hashMap.put(new String("1"), "xyz");
		
		// Here the size of HashMap 1 and size of IdentityHashMap is 2
		
		System.out.println("Size of HashMap :: " + hashMap.size());
		System.out.println("Size of IdentityHashMap :: " + identityHashMap.size());
	}
}