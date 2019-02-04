package com.rahul.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ MultiTestCase.class, SumTestCase.class })

/*@UseTechnicalNames*/ //To show Full Class Name with pkg....smiliar to @DisplayName("")...--->Rename the class 

@DisplayName("All....Tests") /// It Override the class Name


public class AllTests {
/*	@DisplayName("Method  name change ho gaya")
*/	/* @Test
	    public void testPlaceOrderOK() {
	        assertEquals(1, 1);
	    }
	
	    @Test
	    public void testPlaceOrderWithAnonymousUser() {
	        assertEquals(1, 1);
	    }
	
	    @Test
	    public void testPlaceOrderWithAuthenticatedUser() {
	        assertEquals(1, 1);
	    }*/
}
