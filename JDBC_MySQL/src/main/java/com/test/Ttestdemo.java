package com.test;

import java.util.List;

public class Ttestdemo {
	public static void main(String[] args) {
		StudentDao edao=new StudentDao();
		Student stu1=new Student();
		stu1.setId(2);
		stu1.setName("rrr");
		stu1.setClg("ksit");
		stu1.setCity("bangalore");
		//edao.saveStudent(stu1);
		edao.updateStudent(stu1);
		System.out.println("Saved Student Data.");
		List<Student> data=edao.getAllStudents();
		data.forEach(System.out::println);
		
	}

}

