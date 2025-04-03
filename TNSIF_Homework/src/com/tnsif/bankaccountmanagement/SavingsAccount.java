package com.tnsif.bankaccountmanagement;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	@Override
	void deposit(double amount) {
		
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount deposited in Savings Account: Rs. "+amount);
		}
		else 
			System.out.println("Invalid Amount");
	}

	@Override
	void withdraw(double amount) {
		
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("Amount withdrawn from Savings Account is: Rs. "+amount);
		}
		else {
			System.out.println("Insuffient Balance!!");
		}
	}

	@Override
	public double getbBalance() {
		double savingsBalance = balance + (balance*interestRate/100);
		return savingsBalance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + "]";
	}

	
}
