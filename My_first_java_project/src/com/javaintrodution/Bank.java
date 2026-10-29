/*
Java :-
1. Create a Class Bank and declare variables acno, balance,accountHolderName and Bank Name 

Create a Method Display and create At least 3 objects and assign the values with object reference and call the method

*/

package com.javaintrodution; // lab

public class Bank {
	int acno;
	int balance;
	String accountHolderName;

	static String bankName = "SBI";

	void display() {
		System.out.println("bank name: " + bankName);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account balance: " + balance);
		System.out.println("Account No: " + acno);

	}

	public static void main(String[] args) {

		Bank b1 = new Bank();
		b1.acno = 123;
		b1.balance = 10000000;
		b1.accountHolderName = "sathwik";
		b1.display();
		System.out.println("---------");
		
		Bank b2 = new Bank();
		b2.acno = 123;
		b2.balance = 10000000;
		b2.accountHolderName = "abhi";
		b2.display();
		System.out.println("---------");

		Bank b3 = new Bank();
		b3.acno = 123;
		b3.balance = 10000000;
		b3.accountHolderName = "junaid";
		b3.display();

	}

}
