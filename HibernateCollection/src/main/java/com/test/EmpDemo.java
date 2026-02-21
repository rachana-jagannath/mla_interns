package com.test;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;

public class EmpDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	List<String> s1=Arrays.asList("Java","Cloud","Devops");
	List<String> s2=Arrays.asList("php","python","React");
	Employee emp1=new Employee();
	emp1.setE_namr("Rahul");
	emp1.setSkills(s1);
	Employee emp2=new Employee();
	emp2.setE_namr("Arjun");
	emp2.setSkills(s2);
	session.persist(emp1);
	session.persist(emp2);
	t.commit();
	TypedQuery tq=session.createQuery("from Employee");
	List<Employee> list=tq.getResultList();
	Iterator<Employee> itr=list.iterator();
	while(itr.hasNext()) {
		Employee emp=itr.next();
		System.out.println("Employee:"+emp.getE_namr());
	List<String> skills = emp.getSkills();
		skills.forEach(System.out::println);
		
	}
	
	session.close();
}
}
