package com.capgemini.exceptionhandling.mains;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exceptionhandling.exception.AgeNotWitinRangeException;
import com.capgemini.exceptionhandling.exception.NameNotValidException;

public class Student {
	private int studentRollNo;
	private String studentName;
	private int age;
	private String studentCourse;
	public Student(int studentRollNo, String studentName, int age, String studentCourse) throws AgeNotWitinRangeException, NameNotValidException {
		super();
		this.studentRollNo = studentRollNo;
		if (validateName(studentName))
        {
			this.studentName=studentName;
        }
		  else
	        	
	        	throw new NameNotValidException("Not Vaild Name");

		if (age <= 21 && age>=15)
        {
        	this.age = age; 
        }
		  else
	        	
	        	throw new AgeNotWitinRangeException("Age between 15 and 21  ");
		this.studentCourse = studentCourse;
	}
	public Student() {
		super();
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public boolean validateName(String studentName) {

	  String regx = "^[\\p{L} .'-]+$";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(studentName);
	    boolean result= matcher.find();
	    return result;

	}
}
