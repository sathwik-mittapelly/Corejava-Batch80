/*
Java:

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
package com.javaintrodution; // Alternate

public class Student2 {

	// Instance variables
	int studentId;
	String studentName;
	String courseName;
	int marks;
	static String collegeName;
	static String principalName;

	// Method to display all student details
	void displayStudentDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Course Name: " + courseName);
		System.out.println("Marks: " + marks);
		System.out.println("---------------------------");
	}

	// Method to display college details
	void displayCollegeDetails() {
		System.out.println("College Name: " + collegeName);
		System.out.println("Principal Name: " + principalName);
		System.out.println("---------------------------");
	}

	// Method to change the principal name
	void changePrincipal(String newPrincipalName) {
		principalName = newPrincipalName;
		System.out.println("Principal name updated successfully!");
	}

	public static void main(String[] args) {
		collegeName = "iare";
		principalName = "nani";
		
		// Creating two Student objects
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();

		// Assigning values to the first object
		s1.studentId = 101;
		s1.studentName = "Rahul";
		s1.courseName = "Java";
		s1.marks = 90;

		// Assigning values to the second object
		s2.studentId = 102;
		s2.studentName = "Suresh";
		s2.courseName = "Python";
		s2.marks = 85;

		// Displaying all student details
		System.out.println("First Student Details:");
		s1.displayStudentDetails();

		System.out.println("Second Student Details:");
		s2.displayStudentDetails();

		// Displaying college details
		System.out.println("College Details:");
		s1.displayCollegeDetails();

		// Changing the principal name
		s1.changePrincipal("Krishna");

		// Displaying updated details
		System.out.println("Updated College Details:");
		s1.displayCollegeDetails();
	}
}
