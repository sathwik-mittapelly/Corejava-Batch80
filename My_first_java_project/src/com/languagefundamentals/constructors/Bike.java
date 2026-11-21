package com.languagefundamentals.constructors;

// constructor chaining
public class Bike {
	String model;
	String brand;
	String color;
	double price;

	public Bike() {
		System.out.println("no-arg constructor called");
		this("unknown");
	}

	public Bike(String model) {
		this(model, "unknown");
	}

	public Bike(String model, String brand) {
		this(model, brand, "black");
	}

	public Bike(String model, String brand, String color) {
		this(model, brand, color, 200000);
	}

	public Bike(String model, String brand, String color, double price) {

		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.bikeInfo();

		Bike b1 = new Bike("Hunter 350");
		b1.bikeInfo();

		Bike b2 = new Bike("Hunter 350", "Royal Enfield");
		b2.bikeInfo();

	}

	
	void bikeInfo() {
		System.out.println("model of the Bike is : " + model);
		System.out.println("brand of the Bike is : " + brand);
		System.out.println("color of the Bike is : " + color);
		System.out.println("price of the Bike is : " + price);
		System.out.println("************************************");

	}

}
