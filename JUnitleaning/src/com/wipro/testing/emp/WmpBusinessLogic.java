package com.wipro.testing.emp;

public class WmpBusinessLogic {

	/**
	 * @param empDet
	 * @return
	 */
	public double calculateYearlySalary(EmployeeDetails empDet){
		double salary = empDet.getSalary();
		double yearlySalary = salary*12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(EmployeeDetails empDet){
		double appraisal =0;
		if(empDet.getSalary() < 10000){
			appraisal = 500;
		}else
			appraisal = 1000;
		return appraisal;
	}
	
	
}
