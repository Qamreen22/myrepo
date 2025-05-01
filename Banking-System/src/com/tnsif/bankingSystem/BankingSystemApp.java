package com.tnsif.bankingSystem;

import java.util.List;
import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingService bankingService = new BankingServiceImplementation();

        while (true) {
            System.out.println("Banking System");
            System.out.println("1. Add Customers");
            System.out.println("2. Add Accounts");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List all Accounts of specific Customer");
            System.out.println("7. List all transactions of specific Account");
            System.out.println("8. List all beneficiaries of specific customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                	System.out.print("Enter Customer ID: ");
                    int custId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Customer Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Customer Contact: ");
                    String contact = scanner.nextLine();
                    Customer customer = new Customer(custId, name, address,contact);
                    bankingService.addCustomer(customer);
                    System.out.println("Customer added successfully.");
                    break;
                case 2:
                	System.out.print("Enter Account ID: ");
                    int accId = scanner.nextInt();
                    System.out.print("Enter Customer ID for this Account: ");
                    int accCustId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Account Type: ");
                    String type = scanner.next();
                    System.out.print("Enter Balance: ");
                    double balance = scanner.nextDouble();
                    Account account = new Account(accId, accCustId, type, balance);
                    bankingService.addAccount(account);
                    System.out.println("Account added successfully.");
                    break;
                case 3:
                	System.out.print("Enter Beneficiary ID: ");
                    int benId = scanner.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int benCustId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Beneficiary Name: ");
                    String benName = scanner.nextLine();
                    System.out.print("Enter Beneficiary Account Number: ");
                    String benAcc = scanner.nextLine();
                    System.out.print("Enter Beneficiary Account Details: ");
                    String benAccDet = scanner.nextLine();
                    Beneficiary beneficiary = new Beneficiary(benId, benCustId, benName,benAcc,benAccDet);
                    bankingService.addBeneficiary(beneficiary);
                    System.out.println("Beneficiary added successfully.");
                    break;
                case 4:
                	System.out.print("Enter Account ID: ");
                    int transAccId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Transaction Type (deposit/withdraw): ");
                    String Transtype = scanner.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    Transaction transaction = new Transaction(transAccId, Transtype, amount);
                    bankingService.addTransaction(transaction);
                    System.out.println("Transaction recorded.");
                    break;
                case 5:
                	System.out.print("Enter Customer ID to search: ");
                    int searchId = scanner.nextInt();
                    Customer foundCustomer = bankingService.findCustomerById(searchId);
                    System.out.println(foundCustomer != null ? foundCustomer : "Customer not found.");
                    break;
                case 6:
                	System.out.print("Enter Customer ID to list accounts: ");
                    int customerId = scanner.nextInt();
                    List<Account> accounts = bankingService.getAccountsByCustomerId(customerId);
                    for (Account acc : accounts) {
                        System.out.println(acc);
                    }
                    break;
                case 7:
                	System.out.print("Enter Account ID to list transactions: ");
                    int accountId = scanner.nextInt();
                    List<Transaction> transactions = bankingService.getTransactionsByAccountId(accountId);
                    for (Transaction tx : transactions) {
                        System.out.println(tx);
                    }
                    break;
                case 8:
                	System.out.print("Enter Customer ID to list beneficiaries: ");
                    int cId = scanner.nextInt();
                    List<Beneficiary> beneficiaries = bankingService.getBeneficiariesByCustomerId(cId);
                    for (Beneficiary b : beneficiaries) {
                        System.out.println(b);
                    }
                    break;
                case 9:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
