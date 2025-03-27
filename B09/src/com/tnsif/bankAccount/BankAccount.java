package com.tnsif.bankAccount;

public class BankAccount {
	private double balance;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance>0)
			this.balance = balance;
		else
			System.out.println("Balance cannot be negative");
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	public void deposit(double balance,double amount) {
		if (amount>0)
			balance+=amount;
		System.out.println("The updated balance is: "+balance);
	}
	public void withdraw(double balance, double amount) {
		if(amount<=balance && balance>0)
			balance-=amount;
		System.out.println("The updated balance is: "+balance);
	}
}
