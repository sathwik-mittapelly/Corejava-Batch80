package com.languagefundamentals;
/*
Non-Primitive
- String
- Array
- Class
- Interface
- collections
- Enum
*/

public class Non_Primitive_DataTypes2 {

	    public static void main(String[] args) {

	        // String
	        String name = "Sathwik";

	        // Array
	        int[] numbers = {10, 20, 30, 40};

	        // Class
	        Student s1 = new Student();

	        System.out.println("Name: " + name);
	        System.out.println("First Number: " + numbers[0]);

	        s1.display();
	    }
	}

	class Student {
	    void display() {
	        System.out.println("This is a Student class");
	    }
	}


