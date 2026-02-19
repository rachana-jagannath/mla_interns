package com.test;

public class exp5 {
	public static void main(String[] args) {
		try
		{
			System.out.println(11/5);
			String name=null;
			System.out.println(name.equals("test"));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("can't divided by zero.");
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("enter a value for string");
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("check string length");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check array length");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("check input string");
		}
		catch(Exception e)
		{
			System.out.println("try again");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}
