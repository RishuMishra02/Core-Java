package com.rahul.singletons;

public class EnumImp {
	public static void main(String[] args) {
		
	
//Thread1 
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Enum instance1=Enum.INSTANCE;
				System.out.println(instance1.hashCode());
			}
		});
		
		

		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Enum instance2=Enum.INSTANCE;
				System.out.println(instance2.hashCode());
			}
		});
		t1.start();
		t2.start();
		
}
}