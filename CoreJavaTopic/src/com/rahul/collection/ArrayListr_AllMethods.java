package com.rahul.collection;
import java.util.*;

public class ArrayListr_AllMethods {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Rahul");
		arrayList.add("Ashish");
		arrayList.add("Mishra");
		arrayList.add("ent");
		
		System.out.println("Orignal ArrayList Content : " +  arrayList.get(2));

		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("B");

		arrayList1.add("c");
		
		System.out.println(" Sub List of ArrayList " + arrayList1.subList(1, 3));
		
		System.out.println("Clone" + arrayList1.clone());
		
		System.out.println("Contain Method : " + arrayList1.contains("A"));

		System.out.println(" Remove Elements is :" + arrayList1.remove(2));
		
		System.out.println(" Sub List of ArrayList " + arrayList1.indexOf("B"));




	}
}
