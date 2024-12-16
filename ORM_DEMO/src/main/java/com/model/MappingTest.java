package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	public static void main(String[] args) {
		oneToone();
	}
	
	//oneToone
	static void oneToone() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Address adr = new Address();
		adr.setCountry("Nepal");
		adr.setCity("ktm");
		adr.setState("Bagmati");
		
		session.save(adr);
		
		Employee emp = new Employee();
		emp.setFname("Roman");
		emp.setLname("Dhami");
		emp.setSalary(9000);
		emp.setAddress(adr);
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		
		
	}
}
