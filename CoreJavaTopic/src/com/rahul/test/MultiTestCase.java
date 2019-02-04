package com.rahul.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*import static org.junit.jupiter.api.Assertions.assertEquals;
*/
import org.junit.After;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;

import com.rahul.Case;
import com.rahul.model.Employee;
@EnableRuleMigrationSupport	

class MultiTestCase {
	
	//@RepeatedTest(1)
	//@DisplayName("Hello Rahul")  //It Override the method name 
	@Test
		public void multi() {
		 Case test = new Case();
			
			int result = test.multi(4, 5);
			/*String string2 = "sfs";
	
			String string3 = "test";
			String string4 = "test";
			assertNotSame(string2, string4);
	*/
			assertEquals(20, result);
/*	System.out.println("Test1 Is calling");
*/		}
/*@BeforeEach
		public  void BeforeEach() throws Exception {
			System.out.println("BeforeEach Is calls");
		}

@BeforeAll
public  static void BeforeAll() throws Exception {
	System.out.println("BeforeAll Is calls");
}
@Disabled
@Test
public  void Test() throws Exception {
	System.out.println("Test 2 Is calls");
}

@AfterAll
public static  void AfterAll() throws Exception {
	System.out.println("AfterAll Is calls");
}
@AfterEach
public  void AfterEach() throws Exception {
	System.out.println("AfterEach Is calls");
}*/

}
