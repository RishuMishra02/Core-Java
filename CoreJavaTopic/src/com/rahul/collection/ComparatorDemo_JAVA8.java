package com.rahul.collection;

import java.util.*;
class EmployeeTest {
	private Integer empId;
	private String name;
	private Integer salary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public EmployeeTest(Integer empId, String name, Integer salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeTest [empId=" + empId + ", |name=" + name + ", |salary=" + salary + "]";
	}
	
	
}


public class ComparatorDemo_JAVA8 {
public static void main(String[] args) {
	List<EmployeeTest> list =new  ArrayList<>();
	list.add(new EmployeeTest(101,"Rahul",1000));
	list.add(new EmployeeTest(108,"Sachin",800));
	list.add(new EmployeeTest(103,"Ashish",40));
	list.add(new EmployeeTest(100,"Kapil",400));
	list.add(new EmployeeTest(110,"Kapil",4000));
	
	ComparatorDemo_JAVA8.sortInLambdaWay(list);
	

}
public static void sortInLambdaWay(List<EmployeeTest> list) {

	System.out.println(" Sort by Name ****Asc Order**** ");
	Collections.sort(list,(EmployeeTest e1, EmployeeTest e2) -> e1.getName().compareTo(e2.getName()));
	list.forEach(emp->System.out.println(emp.toString()));
	
	
	
	System.out.println(" Sort by Name ****Desc Order**** ");
	Collections.sort(list,(EmployeeTest e1, EmployeeTest e2) -> e2.getName().compareTo(e1.getName()));
	list.forEach(emp->System.out.println(emp.toString()));

	System.out.println(" Sort by Salary ****Asc Order**** ");
	Collections.sort(list,( e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
	list.forEach(emp->System.out.println(emp.toString()));
	
	

	System.out.println(" Sort by Salary ****Desc Order**** ");
	Collections.sort(list,( e1, e2) -> e2.getSalary().compareTo(e1.getSalary()));
	list.forEach(emp->System.out.println(emp.toString()));

	
}
}














