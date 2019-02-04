package com.rahul.equals;

import java.util.StringJoiner;

public class Rahul {
	public static void main(String[] args) {
		String s1 = "rahul";
		System.out.println(s1);

		String s4 = "Rahul";
		s4.concat("Rishu");
		System.out.println(s4); // Pring only Rahul

		String s5 = new String("R");
		s5.concat("Mishra");
		System.out.println(s5); // Pring only R

		StringBuffer s2 = new StringBuffer("Rahul");
		String s0 = s2.toString();
		System.out.println(s0);
		s0.concat("Mishra");
		System.out.println(s0);
		StringBuffer s3 = new StringBuffer("Rahul");
		// System.out.println(s1==s4);

		// System.out.println(s1==s2);
		// System.out.println(s2==s3);

		// System.out.println(s1.equals(s2));
		// System.out.println(s2.equals(s3));
 
/*		StringJoiner my = new StringJoiner(" -> ","(hi this is Rahul" ,")");
		my.add("");
		//my.add("");
		System.out.println(my);
		
		StringJoiner my1 = new StringJoiner(" : ","","");
		my1.add("One");
		my1.add("Two");

		//System.out.println(my1.setEmptyValue("this is default value"));
		StringJoiner mered = my.merge(my1);
		System.out.println(mered);*/
		
		String s22 = "Rahul";
	//	System.out.println(s22.concat("Mishra"));
		
		String s23 = "Rahul"+"Mishra";
		String s33=s22.concat(s23);
		System.out.println(s33);
		
		System.out.println(s22==s23);
		System.out.println(s22.equals(s23));
		
	/*	StringBuilder ss= new StringBuilder("Rishi");
		ss.append("Rishu");
		System.out.println(ss);*/ 	//Why StringBuilder is not thread safe....
		
		
		
		/*StringBuffer s20 = new StringBuffer("Rahul");
		System.out.println(s20.append("Mishra"));*/
		//String s21 = new String("Rahul");
		//System.out.println(s20==s21);
	//	System.out.println(s20.equals(s21));
		
		
	}

	
}
