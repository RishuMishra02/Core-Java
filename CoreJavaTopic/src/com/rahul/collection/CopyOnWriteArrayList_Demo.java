package com.rahul.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.platform.commons.util.StringUtils;

public class CopyOnWriteArrayList_Demo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		// It Iterator is Thread-Safe Variant of ArrayList , Introduce in 1.5 ,

		list.add("Rahul");
		list.add("Kapil");
		list.add("Mishra");



		
		
		//System.out.println("Using Get Method :" + list.get(1)); //Get Method use get The Value by passing index
											// but in ArrayList indexOf() return the index...by passing the value
		// synchronized (list) //No Need To Synchronized Block
		{

			ListIterator<String> itr = list.listIterator();
			while (itr.hasNext()) {
				//list.remove("Kapil"); // It throw ConcurrentModificationException So use CopyOnWriteArrayList
				String s = (String) itr.next();

				System.out.println(s);
				list.add("Rsssss"); // Doesn't throw ConcuurentModificationException

				/*if (s.equals("Rahul")) {
					itr.remove(); // Iterator doesn't remove ...throw Exception unsupported Opertion Ex

				}*/
				//System.out.println(list);
			}

			// System.out.println(Collections.synchronizedList(list));

		}
	}
}
