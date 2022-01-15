package com.wipro.testing.emp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWmpBusinessLogic{

	WmpBusinessLogic empBusLog = new WmpBusinessLogic();
	EmployeeDetails empDet = new EmployeeDetails();
	//The other annotaions tht can be used are @BEFORE,@AFTER -
	//before after each test case, @BEFORECLASS and @AFTERCLASS
	//and @IGNORE - avoids a test case from running
	/**
	 * Test method for calculateAppriasal
	 */
	@Test
	public void testCalculateAppraisal(){
		empDet.setName("Thilagavathi Arulalan");
		empDet.setAge(32);
		empDet.setSalary(65000);
				
		double appraisal = empBusLog.calculateAppraisal(empDet);
		assertEquals(1000,appraisal,0.0);
	}
	//Test annotation van be given along with timeout as
	//@Test(timeout=1000) 
	//And they can also be given with an expected exception as
	//@Test(expected=ArithmeticException.class)
	@Test
	public void testCalculateYearlySalary(){
		empDet.setName("Thilagavathi Arulalan");
		empDet.setAge(32);
		empDet.setSalary(65000);
		double yearlySal = empBusLog.calculateYearlySalary(empDet);
		assertEquals(780000,yearlySal,0.0);
	}
	
	
	
	

}
