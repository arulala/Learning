package com.wipro.testing.emp;

import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;

public class TestJUnit2 extends TestCase {
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Before
	public void setUp(){
		System.out.println("Inside Second test case setup");
		message = "Salute "+ message;
	}
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside Second test case print");
		assertEquals(message, messageUtil.salutationMessage());
	}
	
	

	
}

