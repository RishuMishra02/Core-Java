package com.rahul.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collections_Utility_Class {
	public static void main(String[] args) {

		//List<String> list = new ArrayList<>();

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(); // It
		 																// Iterator is Thread-Safe Variant of
		 															// ArrayList
		 															// Intro in 1.5 ,
		{
			list.add("Rahul");
			list.add("Kapil");

			list.add("Kapil");

			System.out.println("Iterating synchronized ArrayList:");

			// synchronized (list) //No Need To Synchronized Block
			{

				Iterator<String> itr = list.iterator();
				while (itr.hasNext()) {
					list.remove("Kapil"); // It throw ConcurrentModificationException So use CopyOnWriteArrayList
					String s = (String) itr.next();
					System.out.println(s);
					list.add("Rsssss");

				}
				System.out.println(list);
			}

			// System.out.println(Collections.singletonList(list));

		}
	}
}
