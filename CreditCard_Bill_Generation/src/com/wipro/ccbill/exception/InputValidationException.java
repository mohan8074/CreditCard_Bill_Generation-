package com.wipro.ccbill.exception;

public class InputValidationException extends Exception {
	
	public String toString()
	{
		return "Invalid";
	}
	public InputValidationException(String str)
	{
		super(str);
	}

}
