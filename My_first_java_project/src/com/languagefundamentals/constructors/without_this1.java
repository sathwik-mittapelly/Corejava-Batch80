package com.languagefundamentals.constructors;

// Constructor - initialize the values without this key word.
// 2.Different names without this keyword.

//Remember: Constructor parameters receive values temporarily, and those values are assigned to instance variables. 
//The instance variables retain the values as long as the object exists.

public class without_this1 {

	int empid;
	String ename;
	int age;

	without_this1(int id, String name, int a) {

		empid = id;
		ename = name;
		age = a;

	}

	public static void main(String[] args) {

		System.out.println("main method started");

		without_this1 obj1 = new without_this1(80, "sathwik", 22);

		System.out.println(obj1.empid);
		System.out.println(obj1.ename);
		System.out.println(obj1.age);

	}
}

/*
2. How does it work?
Here, we have different names for instance variables and constructor parameters.
Instance variable	Constructor parameter
empid	id
ename	name
age	a

When you write:
empid = id;


- empid refers to the instance variable.
- id refers to the constructor parameter.
There is no naming conflict, so Java can identify them correctly.
3. Execution flow
When this statement executes:
without_this obj1 = new without_this(80, "sathwik", 22);


The following assignments happen:
empid = 80;
ename = "sathwik";
age = 22;


The object gets initialized with these values.
Expected output
main method started
80
sathwik
22


4. Difference between both approaches
Without this (same names)	Without this (different names)
empid = empid;	empid = id;
Parameter shadows instance variable	No variable shadowing
Instance variable remains 0	Instance variable gets 80
Incorrect initialization	Correct initialization

My suggestion: Learn both approaches:
1. Same names with this keyword.
2. Different names without this keyword.
Both are valid Java approaches.

Remember: this is not compulsory in a constructor. It is useful when you want to refer explicitly to the current object's instance variables, especially when parameter names are the same.


*/


