package com.tnsif.test;

public class Truck extends Vehicle {
	private int cargoCapacity;
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(String model, String brand, int year) {
		super(model, brand, year);
		// TODO Auto-generated constructor stub
	}

	public Truck(int cargoCapacity) {
		super();
		this.cargoCapacity = cargoCapacity;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public String toString() {
		return "Truck [cargoCapacity=" + cargoCapacity + "]";
	}

	void start() {
		System.out.println("Start Truck");
		}
	void stop() {
		System.out.println("Stop Truck");
	}
	String getDetails() {
		return toString();
	}
}
