package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class Non_Primitive_DataTypes {
	// Non Primitive Data Types
	// i) Pre-Defined Object Data Types

	String s;
	StringBuffer sb;

	BigInteger bi;
	BigDecimal bd;

	Integer i;
	Character c;
	Boolean b;

	public static void main(String[] args) {

		Non_Primitive_DataTypes x = new Non_Primitive_DataTypes();

		// In Non primitive data types Every object default value is null
		System.out.println("String value : "+x.s);
		System.out.println("StringBuffer value : "+x.sb);
		System.out.println("BigInteger value: "+x.bi);
		System.out.println("BigDecimal value"+x.bd);
		System.out.println("Interger value : "+x.i);
		System.out.println("Character vlaue"+x.c);
		System.out.println("Boolean"+x.b);

	}

}
