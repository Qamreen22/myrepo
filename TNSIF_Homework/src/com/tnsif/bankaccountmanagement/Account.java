package com.tnsif.bankaccountmanagement;

public abstract class Account {
	protected double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract double getbBalance();
	
	void displayBalance() {
		System.out.println("Current Balance: Rs. "+balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
