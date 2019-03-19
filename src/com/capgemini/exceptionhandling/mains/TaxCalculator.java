package com.capgemini.exceptionhandling.mains;

import com.capgemini.exceptionhandling.exception.CountryNotValidException;
import com.capgemini.exceptionhandling.exception.EmployeeNameInvalidException;

public class TaxCalculator {
	
	private String employeeName;
	private String employeeCountry;
	private long employeeSalary;
	private long taxAmount;

	public TaxCalculator(String employeeName, String employeeCountry, long employeeSalary) throws CountryNotValidException, EmployeeNameInvalidException {
		super();
		if(employeeName==null || employeeName.isEmpty())
			throw new EmployeeNameInvalidException("Null should not be Employee name");
		else
			this.employeeName = employeeName;
		if(employeeCountry=="Indian")
			this.employeeCountry= employeeCountry;
		else
			throw new  CountryNotValidException("Employee Should be Indian");
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCountry() {
		return employeeCountry;
	}

	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public TaxCalculator() {
		super();
	
	}
	public long calculatorTax(long employeeSalary)
	{
		if(employeeSalary>=10000)
			taxAmount=(employeeSalary*8)/100;
		return taxAmount;
	}

}
