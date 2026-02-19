package com.test                                                                                                                            ;
import java.util.Scanner;
public class TestDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		DataValidator obj=new DataValidator();
		obj.checkAge(age);
	}
}
        