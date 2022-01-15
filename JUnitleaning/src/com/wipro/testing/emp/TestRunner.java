package com.wipro.testing.emp;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Result result = JUnitCore.runClasses(TestWmpBusinessLogic.class);
		Result result = JUnitCore.runClasses(TestJUnitSuite.class);
		for(Failure failure:result.getFailures()){
			System.out.println("faliures:"+ failure.toString());
		}
System.out.println(result.getRunCount()+" and result:-" +result.wasSuccessful());
	}

}
