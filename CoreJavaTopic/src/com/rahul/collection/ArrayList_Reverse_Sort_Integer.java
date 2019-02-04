package com.rahul.collection;

import java.util.*;
public class ArrayList_Reverse_Sort_Integer {

	public static void main(String args[]) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(11);
		arraylist.add(2);
		arraylist.add(7);
		arraylist.add(-3);
		/* ArrayList before the sorting */
		System.out.println("Before Sorting:");

		System.out.println(arraylist.equals(2)); // False ArrayList comparee onle obj not

		Iterator<Integer> itr = arraylist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/* Sorting of arraylist using Collections.sort */
		
		Collections.sort(arraylist, Collections.reverseOrder());
		System.out.println(arraylist);

		
	/*	  Collections.reverse(arraylist);
		   System.out.println(arraylist);*/
		 
		/* ArrayList after sorting */
		System.out.println("After Sorting:");
		for (int counter : arraylist) {
			System.out.println(counter);
		}
	}
}
