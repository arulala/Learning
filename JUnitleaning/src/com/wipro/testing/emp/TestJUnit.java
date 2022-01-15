package com.wipro.testing.emp;

import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;

public class TestJUnit extends TestCase {
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside First test case print");
		assertEquals(message, messageUtil.printMessage());
	}
	
	

	
}

