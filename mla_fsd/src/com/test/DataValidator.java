package com.test;

public class DataValidator {
	public void checkAge(int age)
	{
		if(age>=18)
		{
			throw(new AgeValidationException("valid"));
		}
		else
		{
			throw(new AgeValidationException("invalid"));
		}
	}
}
