package com.capgemini.exceptionhandling;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.exceptionhandling.exception.InvalidDayException;
import com.capgemini.exceptionhandling.exception.InvalidMonthException;
import com.capgemini.exceptionhandling.mains.Date;

public class DateTest {
	@Test
	public void testCheckDateObjectIsDefaultConstructor() {
		Date date = new Date();
		assertNotNull(date);
	}

	@Test
	public void testToCheckValidDate() throws InvalidDayException, InvalidMonthException {
		Date date = new Date(28, 6, 1995);
	}

	@Test(expected=InvalidDayException.class)
	public void testToCheckInValidDay() throws InvalidDayException, InvalidMonthException {
		Date date = new Date(32, 6, 1995);
	}

	@Test
	public void testToCheckValidDay() throws InvalidDayException, InvalidMonthException {
		Date date = new Date(25, 7, 1997);

	}

	@Test(expected=InvalidMonthException.class)
	public void testToCheckInValidMonth() throws InvalidDayException, InvalidMonthException {
		Date date = new Date(2, 16, 1995);
	}
	@Test
	public void testToCheckValidMonth() throws InvalidDayException, InvalidMonthException {
		Date date = new Date(2, 10, 1995);
	}
}
