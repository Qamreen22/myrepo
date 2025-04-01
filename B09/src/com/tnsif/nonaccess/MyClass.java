package com.tnsif.nonaccess;

public class MyClass {
	//private int id;
	private static int srNo = 20;
	private int section; //instance variable
	static {
		System.out.println("This is a static block");
		System.out.println("This is a static variable "+srNo);
	}
	static void display(){
		System.out.println("This is a static method");
	}
	
	MyClass(){
		System.out.println("default constructor");
		srNo++;
		section++;
		System.out.println("This is a static variable "+srNo);
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
}
