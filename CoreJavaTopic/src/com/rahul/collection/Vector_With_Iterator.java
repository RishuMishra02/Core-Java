package com.rahul.collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector_With_Iterator {
public static void main(String[] args) {
	Vector <String>vector= new Vector<>();
	vector.add("Rahul");
	vector.add("Mishra");
	vector.stream();
	Iterator<String> itr = vector.iterator();
	while(itr.hasNext()) {
		String s=(String)itr.next();
		System.out.println(s);
	}
}
}
