package com.test;
@FunctionalInterface
interface FunInf1
{
	String greetUser(String name,String msg);
}
public class Exp3 {
	public static void main(String[] args) {
		FunInf1 obj1=(String name,String msg) ->
		{
			System.out.println("Hi "+name+" "+msg);
			return "Hello "+name+ " MLA "+msg;
		};
		System.out.println(obj1.greetUser("Rachana", "Welcome to FSD MetaGeek Coders..."));
	}
}
