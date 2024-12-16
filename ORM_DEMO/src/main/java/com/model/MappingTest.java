package com.model;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	public static void main(String[] args) {
		//oneToone();
		//oneTomany();
		manyTomany();
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
	//one to many
	static void oneTomany() {
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
		
		Phone p1 = new Phone();
		p1.setNumber("9841214232");
		p1.setType("Ncell");
		p1.setEmployee(emp);
		session.save(p1);
		
		Phone p2 = new Phone();
		p2.setNumber("9876542123");
		p2.setType("NTC");
		p2.setEmployee(emp);
		session.save(p2);
		
		emp.setPhoneList(Arrays.asList(p1,p2));
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		
	}
	//many to many
	static void manyTomany() {
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
		
		Phone p1 = new Phone();
		p1.setNumber("9841214232");
		p1.setType("Ncell");
		p1.setEmployee(emp);
		session.save(p1);
		
		Phone p2 = new Phone();
		p2.setNumber("9876542123");
		p2.setType("NTC");
		p2.setEmployee(emp);
		session.save(p2);
		
		Department d1 =new Department();
		d1.setName("IT");
		session.save(d1);
		
		Department d2 =new Department();
		d2.setName("Admin");
		session.save(d2);
		
		emp.setDeptList(Arrays.asList(d1,d2));
		emp.setPhoneList(Arrays.asList(p1,p2));
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
}
