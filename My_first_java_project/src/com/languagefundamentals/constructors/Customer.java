package com.languagefundamentals.constructors;

class Person {
	String name;
	int age;
	String city;

	Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;

	}

}

public class Customer extends Person {

	Customer() {
		super("sathwik", 22, "Hanamkonda");

	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.customerInfo();

	}

	void customerInfo() {
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("City is : " + city);
	}

}
