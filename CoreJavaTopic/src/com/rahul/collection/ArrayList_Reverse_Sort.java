package com.rahul.collection;

import java.util.*;


public class ArrayList_Reverse_Sort  {

	public static void main(String args[]){
	   ArrayList<String> arraylist = new ArrayList<String>();
	   arraylist.add("AA");
	   arraylist.add("ZZ");
	   arraylist.add("CC");
	   arraylist.add("FF");

     //  String arraylistToString = StringUtils.collectionToCommaDelimitedString(arraylist,":");

	   
	   /*Unsorted List: ArrayList content before sorting*/
	   System.out.println("Before Sorting:");
	   for(String str: arraylist){
			System.out.println(str);
		}

	   /* Sorting in decreasing order*/
	   Collections.sort(arraylist,Collections.reverseOrder());//, Collections.reverseOrder());
	  System.out.println(arraylist);
	   
	  /* Collections.reverse(arraylist);
		  System.out.println(arraylist);
*/
	   /* Sorted List in reverse order*/
	   System.out.println("ArrayList in descending order:");
	   for(String str: arraylist){
			System.out.println(str);
		}
	}
}
