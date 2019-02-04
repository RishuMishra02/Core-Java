package com.rahul.singletons;

public class Volatile_With_Synchronized {

	private static volatile Volatile_With_Synchronized  instance;

private Volatile_With_Synchronized() {
	
}
public static Volatile_With_Synchronized getInstance() {
	if(instance ==null) {
		synchronized (Volatile_With_Synchronized.class) {
			if(instance ==null) {
				instance = new Volatile_With_Synchronized();
			}
		}
	}
	return instance;
	
}

}
