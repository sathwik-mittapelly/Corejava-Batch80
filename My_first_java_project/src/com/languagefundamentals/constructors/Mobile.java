package com.languagefundamentals.constructors;

//Super class / Parent / Base
class Product {

	String model;
	String brand;
	double price;
	String color;

	Product() {
		System.out.println("parent constructor called");

	}

	Product(String model, String brand) {
		this.model = model;
		this.brand = brand;

	}

	public static void main(String[] args) {
		System.out.println("main method started from parent");
	}

}

//Sub-class / Child / Derived
//Mobile IS-A Product
//In Java, to achieve Inheritance, we use extends keyword.
//Inheritance means, Getting the Parent class functionalities into child class to provide code reusability.
//And to avoid code duplication.
public class Mobile extends Product {
// if varible in child class, but i want parent from i will use super.
	String model = "iPhone 17";

//	Whenever we extends Parent class,
//	Automatically, the child class constructor calls the Super class constructor implicitly if we are not calling.
	Mobile() {
		System.out.println("child constructor called");
	}

	Mobile(String model, String brand, double price, String color) {
		super.model = model;
		super.brand = brand;
		super.price = price;
		super.color = color;

	}

	Mobile(String model, String brand) {
		super(model, brand);

	}

	public static void main(String[] args) {
		System.out.println("main method started from child");
		Mobile m = new Mobile();
		m.mobileInfo();

		Mobile m1 = new Mobile("Realme 16 Pro", "Realme", 31999, "white");
		m1.mobileInfo();

		Mobile m2 = new Mobile("Galaxy S26 Ultra", "Samsung");
		m2.mobileInfo();
	}

	void mobileInfo() {
		System.out.println("model of the mobile is : " + super.model);
		System.out.println("brand of the mobile is : " + brand);
		System.out.println("price of the mobile is : " + price);
		System.out.println("color of the mobile is : " + color);
		System.out.println("************************************");
	}

}
