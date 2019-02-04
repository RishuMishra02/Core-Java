package com.rahul.collections_Utility;

import java.util.*;

public class Shuffle {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Rishu");
		list.add("as");

		list.add("ka");
		list.add("Mishra");



	//	List<String> list1=Collections.unmodifiableList(list);
		//Collections.replaceAll(list,"Rahul","Mishra");
		Collections.shuffle(list);
		
		//list.add("Ghisu");            // changes Done 
		//list1.add("Jai");       		// throw unsupported operation exception
		System.out.println(list);

	}
}
