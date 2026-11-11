package com.languagefundamentals;

public class Primitive_DataTypes {

	// Primitive Data Types

	byte b;
	short s;
	int i;
	long l;

	float f ;
	double d;

	char c;
	boolean boo;
	


	public static void main(String[] args) {

		Primitive_DataTypes p = new Primitive_DataTypes();

		System.out.println("byte: " + p.b); //0
		System.out.println("short: " + p.s); //0
		System.out.println("int: " + p.i); //0
		System.out.println("long: " + p.l); //0
		System.out.println("float: " + p.f); //0.0
		System.out.println("double: " + p.d); //0.0
		System.out.println("char: " + p.c); // Empty Space
		System.out.println("boolean: " + p.boo); //false
	}
}
