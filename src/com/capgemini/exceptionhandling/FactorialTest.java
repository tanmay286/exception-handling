package com.capgemini.exceptionhandling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.exceptionhandling.exception.InvalidInputException;
import com.capgemini.exceptionhandling.mains.factorial;
public class FactorialTest {


	@Test
	public void testValueWithValidInput() throws InvalidInputException 
	{
			
		factorial fact=new factorial();
		assertEquals(120, fact.getFactorial(5));
		
	}
	@Test(expected = InvalidInputException.class)
	public void testValueWithInvalidInput() throws InvalidInputException 
	{
		factorial fact=new factorial();
		fact.getFactorial(1);
		
	}
	
}
