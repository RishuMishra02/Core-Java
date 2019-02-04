package com.rahul.singletons;
import java.lang.reflect.Constructor; 

class Single {
	private  static Single instance ;
	public static Single getInstance() {
		if(instance ==null) {
			instance =new Single();
		}
		return instance;
	}

	
	private Single() {}
	
}
public class UsingReflection {
public static void main(String[] args) {
	Single instance1 =Single.getInstance();
	Single instance2=null;
	try {
		Constructor[] constructors 	=Single.class.getDeclaredConstructors();
		for(Constructor cont: constructors) {
			cont.setAccessible(true);
			instance2=(Single)cont.newInstance();
			break;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	System.out.println(" First " +instance1.hashCode());
	System.out.println("Second " +instance2.hashCode());
}
}
