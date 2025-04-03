package com.tnsif.insterface2;

public class DebitCard implements Payment{
	private String cardNo;

	public DebitCard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing debit card payment of Rs. "+amt+" using Debit Card No.: "+cardNo);
		
	}
}
