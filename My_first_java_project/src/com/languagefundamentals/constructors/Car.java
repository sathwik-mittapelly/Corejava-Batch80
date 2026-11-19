package com.languagefundamentals.constructors;

//JAVA:
//1.Write a Java program to implement constructor chaining using this() and super() 
//by creating a Vehicle class with fields brand and model, 
//and a child Car class with additional fields fuelType and price. Display all vehicle details.

//Parent class
class Vehicle {

	String brand;
	String model;

	// No-argument constructor
	Vehicle() {
		this("Toyota", "Fortuner");
		System.out.println("Vehicle no-argument constructor");
	}

	// Parameterized constructor
	Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
		System.out.println("Vehicle parameterized constructor");
	}
}

//Child class
class Car extends Vehicle {

	String fuelType;
	double price;

	// No-argument constructor
	Car() {
		this("Diesel", 3500000);
		System.out.println("Car no-argument constructor");
	}

	// Parameterized constructor
	Car(String fuelType, double price) {
		super();

		this.fuelType = fuelType;
		this.price = price;

		System.out.println("Car parameterized constructor");
	}

	// Display vehicle details
	void displayDetails() {

		System.out.println("\n***********Vehicle Details*************");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Price: " + price);
	}

	public static void main(String[] args) {

		Car c2 = new Car();

		c2.displayDetails();
	}
}
