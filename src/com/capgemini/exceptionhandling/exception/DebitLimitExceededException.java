package com.capgemini.exceptionhandling.exception;

public class DebitLimitExceededException extends Exception {
	public DebitLimitExceededException(String message) {
		super(message);
	}

}
