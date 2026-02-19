package com.test;
interface Inf1
{
	float pi = 3.14f;//public static final float pi = 3.14f;
	void disp();//public abstract void disp();
	void cat();
	default void human()
	{
		System.out.println("default inf");
		animal();
	}
	static String greetUser(String msg)
	{
		//animal();
		return msg;
	}
	private void animal()
	{
		System.out.println("private method");
	}
}
	/*
	public Inf1()
	{
		
	}
	*/
interface Inf2
{
	void book();
}
abstract class Abs1
{
	public Abs1()
	{
		System.out.println("constructor");
	}
	public abstract void fox();
	public void color()
	{
		System.out.println("implemented method abs1");
	}
}
class Imp1 extends Abs1 implements Inf1,Inf2
{
	public void fox()
	{
		System.out.println("abs implemented");
	}
	@Override
	public void book()
	{
		System.out.println("inf2 implemented");
	}
	@Override
	public void disp()
	{
		System.out.println("inf1 implemented");
	}
	@Override
	public void cat()
	{
		System.out.println("inf1 implemented");
	}
}


public class Exp1 {
	public static void main(String[] args) {
		Imp1 obj = new Imp1();
		obj.book();
		obj.cat();
		obj.disp();
		obj.human();
		obj.fox();
		obj.color();  
		//dynamic binding
		System.out.println(Inf1.greetUser("Hello MLA Coders"));
	}
}
/*
 * How many ways we can create object for the class
 * 
 * using NEW operator
 * using factory method
 * using clone() method
 * using class.forName() dynamic object creation
*/

