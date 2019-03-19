package com.capgemini.exceptionhandling;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.capgemini.exceptionhandling.exception.CountryNotValidException;
import com.capgemini.exceptionhandling.exception.EmployeeNameInvalidException;
import com.capgemini.exceptionhandling.mains.TaxCalculator;

public class TaxCalculatorTest {
	@Test
	public void toCheckTacCalculatorObjectIsCreated() {
		TaxCalculator taxcalculator=new TaxCalculator();
		assertNotNull(taxcalculator);
	}
	
	@Test(expected=CountryNotValidException.class)
	public void toCheckCountryOfEmployeeIsNotIndian() throws CountryNotValidException, EmployeeNameInvalidException{
		TaxCalculator taxcalculator=new TaxCalculator("tanmay","America",43234);
		assertNotNull(taxcalculator.getEmployeeCountry());
		
	}
	@Test
	public void toCheckCountryOfEmployeeIsIndian() throws CountryNotValidException, EmployeeNameInvalidException{
		TaxCalculator taxcalculator=new TaxCalculator("tanmay","Indian",43234);
		assertNotNull(taxcalculator.getEmployeeCountry());
		
	}
	@Test
	public void toCheckCountryOfEmployeeValidName() throws CountryNotValidException, EmployeeNameInvalidException{
		TaxCalculator taxcalculator=new TaxCalculator("Ruchir","Indian",43231);
		assertNotNull(taxcalculator.getEmployeeName());
		
	}
	@Test(expected=EmployeeNameInvalidException.class)
	public void toCheckCountryOfEmployeeInValidName() throws CountryNotValidException, EmployeeNameInvalidException{
		TaxCalculator taxcalculator=new TaxCalculator("","Indian",43231);
		assertNull(taxcalculator.getEmployeeName());
		
	}
	
	
}
