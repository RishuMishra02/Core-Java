package com.rahul.collections_Utility;

import java.util.*;

public class Rotate {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		/*list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		 */
		list.push("R");

		list.push("A");

		list.add("H");

		list.add("U");

		list.add("L");

		System.out.println("Before Rotate List " + list);
		 Collections.rotate(list, 1);
		//System.out.println(list.poll());
		System.out.println("After Rotate List " + list);
		//System.out.println(list);

	/*	
		System.out.println(list.peek()); // peek first element without remove the elements and does not throw
		System.out.println(list.offer("M"));
		System.out.println(list.element());  //without remove but throw exception
		System.out.println(list.poll());  // remove element but does not throw Exception
		System.out.println(list);
*/
	}
}
