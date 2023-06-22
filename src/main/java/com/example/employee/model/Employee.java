package com.example.employee.model;

import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Lob
	private byte[] image;
	private String name;
	private String sex;
	private String dob;
	private long salary;
	private String department;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(long id, byte[] image, String name, String sex, String dob, long salary, String department) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.sex = sex;
		this.dob = dob;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
	
	
}
	