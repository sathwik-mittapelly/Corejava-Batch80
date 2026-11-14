package com.languagefundamentals;

class Stu {
	int stid = 18;
	String sname="sathwik";
	int age=22;

	Address address = new Address();
}

class Address {
	String city="Hanamkonda";
	String state="Telangana";

}

public class Objectdatatypes_userdefined {

	public static void main(String[] args) {
		Stu s1 = new Stu();
		System.out.println(s1.stid); //0  by default
		System.out.println(s1.sname); // null  by default
		System.out.println(s1.age); //0 
		System.out.println(s1.address.city); // null
		System.out.println(s1.address.state);

	}

}


