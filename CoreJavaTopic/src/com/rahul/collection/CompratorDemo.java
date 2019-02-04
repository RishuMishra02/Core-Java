package com.rahul.collection;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
class Student {
	private int rollNo;
	private String name;
	private float marks;
	
	
	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Roll no is :" + rollNo + " Marks is : " + marks );
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
}

class RollCompare implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.getRollNo() > s2.getRollNo())
			return 1;
		else if (s1.getRollNo() < s2.getRollNo())
			return -1;
		else
			return 0;
	}

}

class MarkesCompare implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.getMarks() > s2.getMarks())
			return 1;
		else if (s1.getMarks() <s2.getMarks())
			return -1;
		else
			return 0;
	}

}



public class CompratorDemo {
public static void main(String[] args) {
	List <Student> list= new LinkedList<>();
	list.add(new Student (101,"Rahul",1500.45f));
	list.add(new Student (105,"Rahul",100.08f));
	list.add(new Student (106,"Rahul",1550.59f));
	list.add(new Student (104,"Rahul",2000.809f));
	
	System.out.println("Sort by Roll Numner ");
	Collections.sort(list,new RollCompare());
	List<Student> str= list.stream()
				.filter(st->st.getRollNo()>105 &&  st.getMarks()>1500)
				.collect(Collectors.toList());
	
	Iterator<Student> itr =str.iterator();
	while(itr.hasNext()) {
		Student ss=itr.next();
		//System.out.println("Roll No .:" + ss.getRollNo() + " Marks is:  " +ss.getMarks());
	ss.display();
	}
	System.out.println("Sort by Marks");
	
	Collections.sort(list, new MarkesCompare());
	 itr = list.iterator();
	while(itr.hasNext()) {
		Student sss = itr.next();
		sss.display();
		
		//System.out.println("Roll No is : " + sss.getRollNo() + " Marks is :" + sss.getMarks());
	}
	
}
}
