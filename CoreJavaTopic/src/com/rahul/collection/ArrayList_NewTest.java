package com.rahul.collection;

import java.util.ArrayList;
import java.util.List;
 
public class ArrayList_NewTest {
    public static void main(String[] args) {
           List<Number> numberList = new ArrayList<Number>();
           numberList.add(2);
           numberList.add(3);
           System.out.println(numberList);
           m(numberList);
    }
 
    static void m(List<? super Double> l) {
           System.out.print(l.get(0));
           System.out.print(l.get(1));
    }
}


/*package com.rahul.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_NewTest {
	public static void main(String[] args) {
		List<String> numberList = new ArrayList<String>();
		numberList.add("R");
		numberList.add("A");
		System.out.println(numberList);
		m(numberList);
	}

	static void m(List<? extends String> l) {
		System.out.print(l.get(1));
	}
}*/