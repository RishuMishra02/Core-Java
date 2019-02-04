package com.rahul.collection;

import java.util.*;
class Employee implements Comparable<Object> {
   int emp_id;
   String emp_name;
   Employee(int eid, String ename) {
      emp_id = eid; emp_name = ename;
   }

   void display() {
      System.out.println(emp_id + " " + emp_name);
   }

   public int compareTo(Object ob) {
      Employee e = (Employee)ob;
      if(emp_id > e.emp_id)
         return 1;
      else
         return -1;
   }
}

public class ComparableDemo {
   public static void main(String[] args) {
      List<Employee> l = new ArrayList<Employee>();
      l.add(new Employee(701, "Rahul"));
      l.add(new Employee(548, "Anjali"));
      l.add(new Employee(635, "Tina"));
      Collections.sort(l);
      Iterator<Employee> it = l.iterator();
      while(it.hasNext()) {
         Employee e = (Employee)it.next();
         e.display();
      }
   }


}

