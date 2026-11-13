package com.languagefundamentals;

public class Datatypes_size {

	public static void main(String[] args) {
		//Byte.BYTES, Integer.BYTES, etc., are predefined constants in Java wrapper classes.
		System.out.println(Byte.SIZE); // SIZE is a property
		System.out.println(Short.SIZE);
		System.out.println("=======================================");

		// Bydefault it will give size in bites so covert into bytes with 8
		System.out.println("byte size: " + Byte.SIZE + " byte");
		System.out.println("short size: " + Short.SIZE / 8 + " bytes");
		System.out.println("int: " + Integer.SIZE / 8 + " bits");
		System.out.println("long: " + Long.SIZE / 8 + " bits");

		System.out.println("==============================");
		System.out.println("char size: " + Character.BYTES + " bytes"); // we can use BYTES also
		System.out.println("boolean size: JVM-dependent"); //Java does not specify a fixed storage size for boolean.
		
		System.out.println("==============================");
		System.out.println("float size: " + Float.BYTES + " bytes");
        System.out.println("double size: " + Double.BYTES + " bytes");
		
	}

}
