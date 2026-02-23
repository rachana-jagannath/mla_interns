package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Customer cust=new Customer();
		Order o1=new Order();
		o1.setO_name("Orange");
		o1.setO_price("5");
		Order o2=new Order();
		o2.setO_name("apple");
		o2.setO_price("10");
		List<Order> list=Arrays.asList(o1,o2);
		Customer cst=new Customer();
		cst.setC_name("Rohit");
		cst.setOrders(list);
		session.persist(cst);
		//t.commit();
		t.rollback(); 
		session.close();
		}
}