package com.rahul.collections_Utility;

import java.util.*;

public class Disjoin {
	public static void main(String[] args) {
			
	List<String> list = new ArrayList<>();
	list.add("Rahul");
	list.add("Mishra");
	list.add(null);
	
	
	
	List<String> list1  = new ArrayList<>();
	list1.add("Rishu");
	list1.add("Mishra1");
	
	
	System.out.println(Collections.disjoint(list, list1));
	
	}
}
