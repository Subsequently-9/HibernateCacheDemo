package com.offcn.demo;

import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.junit.Test;


public class App {

	
	private static SessionFactory sf;
	static {
		sf = new Configuration()
			.configure()
			.addClass(Dept.class)   
			.addClass(Employee.class)   // ≤‚ ‘ ±∫Ú π”√
			.buildSessionFactory();
	}
	
	
	@Test
	public void show(){
		Session session = sf.openSession();
		session.beginTransaction();
		Dept dept = (Dept)session.get(Dept.class,1 );
		System.out.println("---888--"+dept.getSetEmp().size());
		System.out.println("---666--"+dept);
		dept.setDname("okok2");
//		session.update(dept);
		
		session.beginTransaction().commit();
		session.close();
		
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		Dept dept2 = (Dept)session2.get(Dept.class, 1);
		System.out.println("---999--"+dept2.getSetEmp().size());
		System.out.println(dept2);
		session2.beginTransaction().commit();
		session2.close();
		
		
	}
	
	
	
	
	
	
}
