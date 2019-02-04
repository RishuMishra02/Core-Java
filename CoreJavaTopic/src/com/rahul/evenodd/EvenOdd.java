package com.rahul.evenodd;

import java.util.Scanner;

public class EvenOdd {
	  private static Scanner scn;
	  public static void main(String[] args) {
	    System.out.println("Enter a number for even/odd test:\t");    
	    scn = new Scanner(System.in);
	    int input = scn.nextInt();
	    //even/odd logic here- % is modular division operator 
	    if(input%2==0){
	      System.out.println(input + " is an even number");
	    }else{
	      System.out.println(input + " is an odd number");
	    }System.gc();
	  }

	}