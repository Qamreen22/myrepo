package com.tnsif.test;

public class Car extends Vehicle {
	private int doors;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String brand, int year) {
		super(model, brand, year);
		// TODO Auto-generated constructor stub
	}
	

	public Car(int doors) {
		super();
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	@Override
	public String toString() {
		return "Car [doors=" + doors + "]";
	}

	void start() {
		System.out.println("Start car");
		}
	void stop() {
		System.out.println("Stop car");
	}
	String getDetails() {
		return toString();
	}
	
}
