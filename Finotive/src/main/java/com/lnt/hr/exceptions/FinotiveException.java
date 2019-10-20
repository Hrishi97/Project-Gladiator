package com.lnt.hr.exceptions;

@SuppressWarnings("serial")
public class FinotiveException extends Exception {

	public FinotiveException(String message, Throwable cause) {
		super(message, cause);
	}

	public FinotiveException(String message) {
		super(message);
	}
}
