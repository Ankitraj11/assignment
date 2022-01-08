package com.technoelevate.pactice;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	int id;
	String name;
	int age;
	double salary;
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
		
	}

	public Employee() {
	
	}

	public Employee(int id, String name, int age,double salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	
	
	
	
	

	

}
