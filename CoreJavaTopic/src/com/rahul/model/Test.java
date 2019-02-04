package com.rahul.model;

import java.util.HashMap;


public class Test {
	HashMap<Employee, Department> map = new HashMap<Employee, Department>();

	public void emp() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Rahul");
		emp.setAge(32);
		emp.setAdd("Indpre");
		
		Department dept = new Department();
		map.put(emp, dept);

	}
}
