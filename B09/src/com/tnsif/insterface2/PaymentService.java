package com.tnsif.insterface2;

public class PaymentService {
	//runtime polymorphism
	void makePayment(Payment pay, double amount) {
		pay.process(amount);
	}
}
