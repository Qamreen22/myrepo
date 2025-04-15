package com.tnsif.comparator;

public class Student {
	int rolNo;
	String name, address;
	public Student(int rolNo, String name, String address) {
		super();
		this.rolNo = rolNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rolNo=" + rolNo + ", name=" + name + ", address=" + address + "]";
	}
	
}
