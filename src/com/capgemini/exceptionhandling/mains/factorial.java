package com.capgemini.exceptionhandling.mains;

import com.capgemini.exceptionhandling.exception.FactorialException;
import com.capgemini.exceptionhandling.exception.InvalidInputException;

public class factorial {
	private int number;


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public factorial() {
		super();
	}
	public int getFactorial(int number) throws InvalidInputException, FactorialException
	{
		int sum=1;
		if(number>=2)
		{
			for(int i=2;i<=number;i++)
			{
				sum=sum*i;
			}
		if(sum>Integer.MAX_VALUE || sum <Integer.MIN_VALUE) {
			throw new FactorialException("Factorial is high input range");
		}
		}
		
		else
			throw new InvalidInputException(" Number should be greater than 2");
		return sum;
	}
	
}
