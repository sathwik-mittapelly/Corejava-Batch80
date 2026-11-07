package com.languagefundamentals.methods.constructors;

// JAVA:
// 1.Create a Student class with studentId, studentName and marks. 
// Initialize all variables using a no-argument constructor. 
// Display student details by calling a method in the main method.

public class Student {
	
	int studentId;
	String studentName;
	int marks;
	
	Student (){
		System.out.println("\nno-agr constructor called");
		studentId = 80;
		studentName = "sathwik";
		marks = 100;
		
	}
	
	void studentDetails() {
		System.out.println("Student id is : "+studentId);
		System.out.println("Student Name is : "+studentName);
		System.out.println("Student Marks is : "+marks);
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method is started");
		Student s1 = new Student();
		s1.studentDetails();
		
		
		System.out.println("\nmain method is ended");
		
	}

}
