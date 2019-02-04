package com.rahul.collections_Utility;

import java.util.*;

public class SwapMethod {
	public static void main(String[] argv) throws Exception {

		try {

			// creating object of List<String>
			List<String> list = new ArrayList<String>();

			// populate the list
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("C");
			list.add("E");
			

			// pritning the list before swap
			System.out.println("Before swap: " + list);

			// swap the elements
			System.out.println("\nSwapping 0th and 4th element.");
			Collections.swap(list, 0, 3);

			// priting the list after swap
			System.out.println("\nAfter swap: " + list);
			
			///Immutable list is create 
			/* List<String> unmodifiable = Collections.unmodifiableList(new ArrayList<>(list));
				
			System.out.println("Before modification: " + unmodifiable);

			list.add("the");
			list.add("best");

			System.out.println("After modification: " + unmodifiable);
			*/
		
	}
		catch (IndexOutOfBoundsException e) {
			System.out.println("\nException thrown : " + e);
		}
	}
}