package com.rahul.test;

import static org.junit.Assert.assertEquals;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rahul.Case;

 class  SumTestCase {

	@Test
	public  void sumOf() {
		Case test = new Case();
		int result = test.sumOf(-2, 7);
		assertEquals(5, result);
	}
}
