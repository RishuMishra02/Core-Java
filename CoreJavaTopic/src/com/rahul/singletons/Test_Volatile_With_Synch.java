package com.rahul.singletons;

public class Test_Volatile_With_Synch {
	public static void main(String[] args) {
		Volatile_With_Synchronized ra = Volatile_With_Synchronized.getInstance();

		for (int i = 0; i < 5; i++) {
			System.out.println(ra.hashCode()
					);
		}
	}

}
