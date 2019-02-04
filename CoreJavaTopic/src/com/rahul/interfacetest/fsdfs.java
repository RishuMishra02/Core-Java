package com.rahul.interfacetest;
public class fsdfs {
public static void main(String[] args) throws Exception{
	   System.out.println(I.s); // accessing Interface I's variable
	   I i = new I() {

	    @Override
	    public int getS() {
	        return 10;
	    }
	   };
	   System.out.println(i.getS()); // accessing I's method
	}




}