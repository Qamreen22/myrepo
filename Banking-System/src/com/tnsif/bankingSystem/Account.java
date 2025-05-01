package com.tnsif.bankingSystem;

public class Account{
	private int customerID;
	private int accountID;
	private String type;
	private double balance;
	public Account(int customerID, int accountID, String type, double balance) {
		super();
		this.customerID = customerID;
		this.accountID = accountID;
		this.type = type;
		this.balance = balance;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [customerID=" + customerID + ", accountID=" + accountID + ", type=" + type + ", balance="
				+ balance + "]";
	}
	
	
}
