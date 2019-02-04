package com.rahul.collection;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapTest {
	public static void main(String args[]){
	     Map<Integer,String> concurrentSkipListMap=new ConcurrentSkipListMap<Integer,String>();
	     
	    concurrentSkipListMap.put(23,"zi");
	    concurrentSkipListMap.put(44, "A");
	    concurrentSkipListMap.put(1, "audi Car");

	    Iterator<Integer> keyIterator = concurrentSkipListMap.keySet().iterator();
	    while (keyIterator.hasNext()) {
	           System.out.println(keyIterator.next());
	    }
	    
	 }
	 
	}