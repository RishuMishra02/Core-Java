package com.rahul.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.*; 
import java.util.stream.Stream;  

public class Spliterator_Test {
public static void main(String[] args) {
	ArrayList<Integer> arrayList= new ArrayList<>();
	arrayList.add(4);
	arrayList.add(-5);
	arrayList.add(-6);
	ArrayList<Integer> arrayList12= new ArrayList<>();
	arrayList12.add(-14);
	arrayList12.add(-15);
	arrayList12.add(-16);
	
	
	Collections.copy(arrayList12, arrayList);   //Collections Utility class Static Method....Copy() Method;
	
//System.out.println("index: " +arrayList12.indexOf(4)); //Pass value Then it return the index of those value

	
	
	System.out.println(Collections.max(arrayList12));  //Print MaxiMum Elements form list
	
	System.out.println("Source"+arrayList);
	
	System.out.println("Destionation"+arrayList12);
	
	
	
	
	Stream<Integer> stream = arrayList.stream();
	Spliterator<Integer> split = stream.spliterator();
	//split.forEachRemaining(System.out::println);
	{
		System.out.println(split.tryAdvance(System.out::println));

	}
	System.out.println("Estimated Element Remaining from list: " + split.estimateSize());

	System.out.println("Element of ArrayList");
    split.forEachRemaining((m)->System.out.println(m));
    
    Stream<Integer> stream1 = arrayList.stream();
	Spliterator<Integer> split1 = stream1.spliterator();
	
	
	
    Spliterator<Integer> split2 = split1.trySplit();  
    
	System.out.println("Estimated Element Remaining from list: " + split2.estimateSize());

    System.out.println("Output from splitr2: ");  

    split2.forEachRemaining((n)->System.out.println(n));  // only one value will be print here
    
	System.out.println("Estimated Element Remaining from list: " + split1.estimateSize());
	
	System.out.println("Exact Size: " + split1.getExactSizeIfKnown());

    System.out.println("Output from split1: ");  
    split1.forEachRemaining(System.out::println);  // All Remaining value will be print her That is 2 values
    
	System.out.println("Estimated Element Remaining from list: " + split1.estimateSize());

	System.out.println("Next Element : " +split1.tryAdvance((n)->System.out.println(n))); //It Return boolean value
   

   
    
    
    
  //  while(split.tryAdvance((n) -> System.out.println(n))); 
	
	
     

}
}
