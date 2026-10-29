/*
Java:-
1. Create a Class Name Employee Take 
 >instance variables:-empid,empname,departmentName,salary
 > static variable :-company

Create 3 objects and using the object reference add 3 Employee data and print the data

*/

package com.javaintrodution; // lab


public class Employee {
	
	int empid;
	String empname;
	String departmentName;
	int salary;
	
	static String company;

	public static void main(String[] args) {
		
		company = "xyz";
		System.out.println(Employee.company);
		
		Employee emp1 = new Employee();
		emp1.empid = 1;
		emp1.empname = "Jhon";
		emp1.departmentName = "IT department";
		emp1.salary = 300000;
		
		System.out.println(emp1.empid);
		System.out.println(emp1.empname);
		System.out.println(emp1.departmentName);
		System.out.println(emp1.salary);
		
		Employee emp2 = new Employee();
		emp2.empid = 2;
		emp2.empname = "rakesh";
		emp2.departmentName = "abc department";
		emp2.salary = 500000;
		
		System.out.println(emp2.empid);
		System.out.println(emp2.empname);
		System.out.println(emp2.departmentName);
		System.out.println(emp2.salary);
		
		Employee emp3 = new Employee();
		emp3.empid = 2;
		emp3.empname = "rakesh";
		emp3.departmentName = "abc department";
		emp3.salary = 500000;
		
		System.out.println(emp3.empid);
		System.out.println(emp3.empname);
		System.out.println(emp3.departmentName);
		System.out.println(emp3.salary);
	}

}
