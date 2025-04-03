package com.tnsif.bankaccountmanagement;

public class Demo {

	public static void main(String[] args) {
		Account savings = new SavingsAccount(2000,5);
		savings.deposit(1000);
		savings.withdraw(200);
		savings.displayBalance();
		System.out.println("Blanace with interest is: Rs. "+savings.getBalance());
		
		Account checking = new CheckingAccount(2000,500);
		checking.deposit(11000);
		checking.withdraw(2200);
		checking.displayBalance();
		System.out.println("Current Blanace is: Rs. "+checking.getBalance());

	}

}
