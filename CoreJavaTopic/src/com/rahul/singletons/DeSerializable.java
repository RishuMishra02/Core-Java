package com.rahul.singletons;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;;


class Singleton implements Serializable{
	private static Singleton instance;
	
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance ==null) {
			instance= new Singleton();
		}
		return  instance;
	}
	
}

public class DeSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
	
Singleton instance1 =Singleton.getInstance();


FileOutputStream fos = new FileOutputStream("employee.ser");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(instance1);
System.out.println(instance1.hashCode());
System.out.println("hi");

oos.close();

FileInputStream fio = new FileInputStream("employee.ser");
ObjectInputStream ois = new ObjectInputStream(fio);
Singleton des=(Singleton)ois.readObject();;
System.out.println(des.hashCode());
}
}
