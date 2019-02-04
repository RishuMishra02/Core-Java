package com.rahul.collection;

import java.util.*;

public class ArrayList_With_Enumeration {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("u");
		list.add("d");
		list.add("c");
		list.add("f");

		List<String> list1 = new ArrayList<>();
		list1.add("c");
		list1.add("k");
		list1.add("z");
		list1.add("h");

		// list.clear();

	System.out.println("" + list.removeAll(list1));

//System.out.println(""+list.removeAll(list1));  // Delete the match list....or Print unmatch object list
		Enumeration<String> enumeration = Collections.enumeration(list);
		while (enumeration.hasMoreElements()) {
			String s = (String) enumeration.nextElement();
			System.out.println("Value using Enumeration :" + s);
		}

	}
}