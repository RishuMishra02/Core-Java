package com.rahul.collection;
import java.util.*;

/*public class IdentityHashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new IdentityHashMap<String, String>();
		map.put(new String("a"), "Rahul");
		map.put(new String("a"), "Mishra");
		
		System.out.println(map);

	}
}*/

public class IdentityHashMapTest{
	public static void main(String[] args) {
		Map<String,String> map= new IdentityHashMap<String,String>();
		map.put(new String ("a"),"R");
		map.put(new String ("a"),"value");
		System.out.println(map);
	}
}