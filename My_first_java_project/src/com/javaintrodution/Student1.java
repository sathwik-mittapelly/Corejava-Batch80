/*
Java

1.Create a class Student to store student details.
Variables:
- studentId
- studentName
- courseName
- marks
- collegeName
- principalName
Methods:
- displayStudentDetails() – Display all student details.
- displayCollegeDetails() – Display college name and principal name.
- changePrincipal() – Change the principal name.
Tasks:
1. Create two Student objects.
2. Assign values to all variables.
3. Display all student details.
4. Display college details.
5. Change the principal name and display the updated details.

*/
package com.javaintrodution; // lab

public class Student1 {

	// Instance variables
	int studentId;
	String studentName;
	String courseName;
	int marks;

	// Static variables
	static String collegeName;
	static String principalName;

	// Method to display student details
	void displayStudentDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Course Name: " + courseName);
		System.out.println("Marks: " + marks);
		System.out.println("----------------------------");
	}

	// Method to display college details
	void displayCollegeDetails() {
		System.out.println("College Name: " + collegeName);
		 System.out.println("Principal Name: " + principalName);
		System.out.println("----------------------------");
	}

	// Method to change the principal name
	void changePrincipal() {
		principalName = "Dr. L V Narasimha Prasad.";
		System.out.println("Principal name updated successfully!");
		
	}

	public static void main(String[] args) {

		// Assign values to static variables
		collegeName = "IARE";
		principalName = "Sathwik";

		// Create two Student1 objects
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();

		// Assign values to the first student
		s1.studentId = 1;
		s1.studentName = "Junaid";
		s1.courseName = "IT";
		s1.marks = 99;

		// Assign values to the second student
		s2.studentId = 2;
		s2.studentName = "Abhi";
		s2.courseName = "IT";
		s2.marks = 100;

		// Display first student details
		System.out.println("First Student Details");
		s1.displayStudentDetails();

		// Display second student details
		System.out.println("Second Student Details");
		s2.displayStudentDetails();

		// Display college details
		System.out.println("College Details");
		s1.displayCollegeDetails();

		// Change the principal name
		s1.changePrincipal();
		

		// updated principal name
		System.out.println("College Details");
		s1.displayCollegeDetails();

	}
}
