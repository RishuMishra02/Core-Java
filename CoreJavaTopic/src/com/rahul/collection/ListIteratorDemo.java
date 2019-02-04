package com.rahul.collection;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {

		List<String> demo = new ArrayList<>();
		demo.add("Rahul");
		demo.add("Rishu");
		demo.add("Mishra");

		ListIterator<String> list_Iter = demo.listIterator();
		while (list_Iter.hasNext()) {

			System.out.println(list_Iter.next());
			demo.set(0, "element");
		}
		System.out.println();

		while (list_Iter.hasPrevious()) {
			System.out.println(list_Iter.previous());
		}
	}
}