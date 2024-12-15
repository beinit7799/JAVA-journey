package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_tbl")
public class Student {
	@Id //PK
	@GeneratedValue //AI
	@Column
	private int id;
	@Column(name="FirstName")
	private String fname;
	@Column
	private String lname;
	@Column
	private String college;
	@Column
	private int age;
	@Column
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", fname=" + fname + ", lname=" + lname + ", college=" + college + ", age=" + age
				+ ", city=" + city + "]";
	}
	

}
