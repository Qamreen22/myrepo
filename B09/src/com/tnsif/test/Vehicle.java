package com.tnsif.test;

public class Vehicle {
	private String model;
	private String brand;
	private int year;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String model, String brand, int year) {
		super();
		this.model = model;
		this.brand = brand;
		this.year = year;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", year=" + year + "]";
	}

	void start() {
		System.out.println("Start vehicle");
		}
	void stop() {
		System.out.println("Stop vehicle");
	}
	String getDetails() {
		return toString();
	}
}
