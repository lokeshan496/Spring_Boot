package com.example.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="StudentDetails")
public class StudentDetails {
	
	private String name;
	private int  age;
	private Double salary;
	
	public StudentDetails(String name, int age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
