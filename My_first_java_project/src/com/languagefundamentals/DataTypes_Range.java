package com.languagefundamentals;

//Important points:
//1. MIN_VALUE represents the minimum value.
//2. MAX_VALUE represents the maximum value.
//3. For float and double, MIN_VALUE means the smallest positive value, not the most negative value.
//4. char stores values from 0 to 65,535.
//5. boolean has only two values: true and false.
//Remember: In Java, use MIN_VALUE and MAX_VALUE to find the range of primitive numeric data types.
public class DataTypes_Range {


    public static void main(String[] args) {

        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        System.out.println("boolean: true or false");
    }
}



