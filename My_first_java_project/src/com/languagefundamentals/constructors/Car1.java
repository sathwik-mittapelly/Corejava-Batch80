package com.languagefundamentals.constructors;

//JAVA:

//1.Write a Java program to implement constructor chaining using this() and super() 
//by creating a Vehicle class with fields brand and model, 
//and a child Car class with additional fields fuelType and price. Display all vehicle details.

class Vehicle1 {

	String brand;
	String model;


	Vehicle1(String brand, String model) {
		this.brand = brand;
		this.model = model;

	}
}

class Car1 extends Vehicle1 {

	String fuelType;
	double price;

	Car1() {
		this("Toyota", "Fortuner","Diesel", 3500000);

	}

	Car1(String brand, String model,String fuelType, double price) {
		super(brand,model);

		this.fuelType = fuelType;
		this.price = price;

	}

	void displayDetails() {

		System.out.println("\n***********Vehicle Details*************");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Price: " + price);
	}

	public static void main(String[] args) {

		Car1 c2 = new Car1();

		c2.displayDetails();
	}
}
