package com.tnsif.nonaccess;

public class Employee {
	private String name;
	private int id;
	static String companyName = "TNSIF";
	//inside non static method we cannot access static variable(io)
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id+"]";
	}
	
}
