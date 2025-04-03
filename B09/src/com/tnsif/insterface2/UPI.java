package com.tnsif.insterface2;

public class UPI implements Payment{
	private String upiId;
	
	public UPI(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing UPI Payment of Rs. "+amt+" using UPI ID: "+upiId);
		
	}

}
