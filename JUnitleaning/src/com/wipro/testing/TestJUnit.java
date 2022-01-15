package com.wipro.testing;

import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;

public class TestJUnit extends TestCase {
	private double floatValue;
	private double floatValue2;

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Before
	public void setUp(){
		System.out.println("In th esetup method");

		floatValue = 1.2;
		floatValue2 = 1.3;
	}

	@Test
	public void testAdd() {
		// test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";

		System.out.println("No: of test cases:"+this.countTestCases());
		System.out.println("name of test case:"+this.getName());
		this.setName("newName");
		System.out.println("new name test case:"+this.getName());
		System.out.println();
		// check for equality
		assertEquals("Junit is working fine", str);

		// check for false condition
		assertFalse(num > 6);

		// check for not null value
		assertNotNull(str);
	}

}

