package com.capgemini.exceptionhandling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.exceptionhandling.exception.AgeNotWitinRangeException;
import com.capgemini.exceptionhandling.exception.NameNotValidException;
import com.capgemini.exceptionhandling.mains.Student;

public class StudentTest {
	@Test
	public void toCheckAgeOfStudentBetweenValidInput() throws AgeNotWitinRangeException, NameNotValidException
	{
		Student student=new Student(12,"tanmay",20,"BE");
		assertEquals(20, student.getAge());
	}
	@Test(expected=AgeNotWitinRangeException.class)
	public void toCheckAgeofStudentWithInvalidInput() throws AgeNotWitinRangeException, NameNotValidException
	{
		Student student=new Student(1,"Tanmay",23,"Cloud");
		assertEquals(23, student.getAge());
	}
	@Test
	public void toCheckNameOfStudentWithCorrectName() throws AgeNotWitinRangeException, NameNotValidException
	{
		Student student=new Student(1,"Tanmay",20,"Cloud");
		student.getStudentName();
	}
	@Test(expected=NameNotValidException.class)
	public void toCheckNameOfStudentWithInCorrectName() throws AgeNotWitinRangeException, NameNotValidException
	{
		Student student=new Student(5,"@Tanmay",34,"Cloud");
		student.getStudentName();
	}
	
}
