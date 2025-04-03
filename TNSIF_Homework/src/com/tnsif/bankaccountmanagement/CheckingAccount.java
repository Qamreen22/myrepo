package com.tnsif.bankaccountmanagement;

public class CheckingAccount extends Account {
	
	private double overDraftLimit;
	
	public CheckingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	
	public CheckingAccount(double balance, double overDraftLimit) {
		super(balance);
		this.overDraftLimit = overDraftLimit;
	}


	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount deposited in Checking Account: Rs. "+amount);
		}
		else 
			System.out.println("Invalid Amount");
	}

	@Override
	void withdraw(double amount) {
		if(amount>0 && (balance-amount)>= -overDraftLimit) {
			balance -= amount;
			System.out.println("Amount withdrawn from Savings Account is: Rs. "+amount);
		}
		else {
			System.out.println("Insuffient Balance!!");
		}
		
	}

	@Override
	double getbBalance() {
		return balance;
	}

}
