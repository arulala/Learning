package com.wipro.testing.param;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	Integer anyNumber;
	Boolean expResult;
	private PrimeNumberChecker primeNumberChecker;
	

	@Before
	public void initialize() {
	      primeNumberChecker = new PrimeNumberChecker();
	 }
	
	public PrimeNumberCheckerTest(Integer anyNumber,
			Boolean expResult){
	this.anyNumber = anyNumber;
	this.expResult = expResult;
	}
	
	
	//It should only return a collection of objects as array
	@Parameterized.Parameters
	public static Collection primeNumbers(){
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true}});
		
	}
	
	@Test
	public void testPrimeNumberChecker(){
		System.out.println("the number is:"+ anyNumber);
		assertEquals(expResult,primeNumberChecker.validate(anyNumber));
	}

}
