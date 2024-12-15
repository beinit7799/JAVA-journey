package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Test {

	public static void main(String[] args) {
		//add();
		//getAll();
		update();
	}
	//add student
	static void add() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Student s = new Student();
		s.setFname("kamal");
		s.setLname("khadka");
		s.setAge(22);
		s.setCollege("KIST");
		s.setCity("Dhading");
		
		session.save(s);//insert sql write
		session.getTransaction().commit();//execute sql
		session.close();
		
	}
	//select from student table
	static void getAll() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria crt = session.createCriteria(Student.class);
		//crt.add(Restrictions.gt("age", 21));
		//crt.add(Restrictions.eq("city","ktm"));
		crt.addOrder(Order.asc("fname"));
		List<Student> slist = crt.list();//select sql
		System.out.println(slist);
	}
	//update
	static void update() {
		
	}
} 
