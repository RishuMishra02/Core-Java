package com.rahul.collection;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_InternalWorking {
	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(65, "sdf");
		map.put(8, "ere");
		map.put(2, "ss");
		map.put(6, "s");
		map.put(15, "sdfsdf");
		map.put(23, "sdfsd");
		map.put(16, "sdfs");
		map.put(342, "sdfs");
		map.put(34, "sfwefs");

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
