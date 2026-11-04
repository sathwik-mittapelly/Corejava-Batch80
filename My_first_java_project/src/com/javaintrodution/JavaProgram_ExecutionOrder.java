package com.javaintrodution;

public class JavaProgram_ExecutionOrder {

	// 1. Static block
	static {
		System.out.println("1. Static block executed");
		System.out.println();
	}

	// 2. Instance initialization block
	{
		System.out.println("2. Instance block executed");
	}

	// 3. Constructor
	JavaProgram_ExecutionOrder() {
		System.out.println("3. Constructor executed");
		System.out.println();
	}

	// 4. Static method
	static void display() {
		System.out.println("4. Static method executed");
		System.out.println();
	}

	// 5. Instance method
	void show() {
		System.out.println("5. Instance method executed");
		System.out.println();
	}

	// Main method
	public static void main(String[] args) {

		System.out.println("Main method started");
		System.out.println();

		// Calling static method
		JavaProgram_ExecutionOrder.display();

		// Creating first object
		System.out.println("Creating first object:");

		JavaProgram_ExecutionOrder s1 = new JavaProgram_ExecutionOrder();

		// Calling instance method
		s1.show();

		// Creating second object
		System.out.println("Creating second object:");

		JavaProgram_ExecutionOrder s2 = new JavaProgram_ExecutionOrder();

		// Calling instance method
		s2.show();

		System.out.println("Main method ended");
	}
}