package com.languagefundamentals.constructors; //Exam

import java.util.Scanner;

// 1. Write a Java program to create a BankAccount class 
// with fields accountNumber, accountHolderName, and balance, using a parameterized constructor. 
// Implement deposit(), withdraw(), checkBalance(), and displayDetails() methods.

public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor
    BankAccount(String accountNumber, String accountHolderName, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("\nAmount deposited successfully.");
            checkBalance();
        } else {
            System.out.println("\nInvalid deposit amount.");
        }
    }

    // Withdraw method
    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("\nInvalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("\nInsufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("\nAmount withdrawn successfully.");
            checkBalance();
        }
    }

    // Check balance method
    void checkBalance() {

        System.out.println("The current balance is: " + balance);
    }

    // Display account details method
    void displayDetails() {

        System.out.println("Account number is: " + accountNumber);
        System.out.println("Account holder name is: " + accountHolderName);
        System.out.println("Account balance is: " + balance);
    }

    // Main method
    public static void main(String[] args) {

        BankAccount b = new BankAccount("123456789102", "Sathwik", 2000);

        b.displayDetails();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter deposit amount:");
        double damount = sc.nextDouble();

        b.deposit(damount);

        System.out.println("\nEnter withdrawal amount:");
        double wamount = sc.nextDouble();

        b.withdraw(wamount);

        sc.close();
    }
}

/*
 * Understand your program execution flow
1. Object creation: Constructor initializes account details and balance.
2. displayDetails(): Displays account information.
3. Scanner: Accepts the deposit amount.
4. deposit(): Adds the amount to the existing balance.
5. Scanner: Accepts the withdrawal amount.
6. withdraw(): Subtracts the amount if sufficient balance is available.
7. checkBalance(): Displays the updated balance.
 */


