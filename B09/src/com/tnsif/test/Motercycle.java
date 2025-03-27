package com.tnsif.test;

public class Motercycle extends Vehicle{
	private boolean hasSidecar;

	public Motercycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motercycle(String model, String brand, int year) {
		super(model, brand, year);
		// TODO Auto-generated constructor stub
	}

	public Motercycle(boolean hasSidecar) {
		super();
		this.hasSidecar = hasSidecar;
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}
	
	@Override
	public String toString() {
		return "Motercycle [hasSidecar=" + hasSidecar + "]";
	}

	void start() {
		System.out.println("Start Motercycle");
		}
	void stop() {
		System.out.println("Stop Motercycle");
	}
	String getDetails() {
		return toString();
	}
	
}
