package com.languagefundamentals.constructors;

// JAVA:

// 1.Write a Java program to create a Student class with fields studentId, studentName, and course. 
// Initialize the data using a parameterized constructor and create another object by copying the values of the first object using a copy constructor. 
// Display the details of both objects.

public class Student1 {
	int studentId;
	String studentName;
	String course;

	Student1(int studentId, String studentName, String course) {
		System.out.println("parameterized constructor");
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
	
	Student1(Student1 s){
		this.studentId = s.studentId = 81;
		this.studentName = s.studentName;
		this.course = s.course;
		
	}

	public static void main(String[] args) {
		Student1 s = new Student1(80, "sathwik", "jfs");
		s.StudentInfo();
		
		Student1 s1 = new Student1(s);
		s1.StudentInfo();
		
		
	}
	
	void StudentInfo(){
		System.out.println("Student id is : " + studentId);
		System.out.println("Student Name is : " + studentName);
		System.out.println("Student course is : " + course);
		System.out.println("**************************************");
		
		
	}

}
