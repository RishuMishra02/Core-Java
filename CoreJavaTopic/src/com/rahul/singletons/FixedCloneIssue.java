package com.rahul.singletons;

class Superclass implements Cloneable{
	protected Object clone()throws CloneNotSupportedException {
		return super.clone();
	}
}
	class Singleton1 extends Superclass{
		public static void show() {
System.out.println("hiii");
		}
		static Singleton1 instance  = new Singleton1();
		
		private Singleton1() {}
		
	@Override
	protected Object clone() {  		//due to this @override Clone method Fixed this Singleton issue
		return instance;
	}
	}
	


public class FixedCloneIssue {
public static void main(String[] args)throws CloneNotSupportedException {
	Singleton1 instance1 = Singleton1.instance;
	Singleton1.show();
	Singleton1 instance2 =(Singleton1)instance1.clone();
	System.out.println("First ins"+instance1.hashCode());
	System.out.println("Second ins"+instance2.hashCode());
}
}
