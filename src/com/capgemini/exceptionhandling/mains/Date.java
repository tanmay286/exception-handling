package com.capgemini.exceptionhandling.mains;

import com.capgemini.exceptionhandling.exception.InvalidDayException;
import com.capgemini.exceptionhandling.exception.InvalidMonthException;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day,int month,int year) throws InvalidDayException, InvalidMonthException {
		super();
		if(day<=31)	
			this.day = day;
		else
			throw new InvalidDayException("Invalid Day ");
		
		if(month<=12)	
			this.month = month;
		else
			throw new InvalidMonthException("Invalid Month");
		
		this.year=year;
		
	}

	public Date() {
		super();
		
	}
	

}
