/*
Java :- 

1.Write a Java Program To Print Your Details 

Ex:-  Name : James
      Company: Sun Microsystems
      Innovation : Java
 */

package com.javaintrodution; // lab

public class First_java_program {

    // Static variable: Declared and initialized in the class
    static String name = "Sun Microsystems";

    // Instance variables: Declared in the class
    String ename;
    String innovation;

    public static void main(String[] args) {

        // Creating an object of the class
        First_java_program x = new First_java_program();

        // Assigning values to instance variables
        x.ename = "James";
        x.innovation = "Java";

        // Printing the details
        System.out.println("Name : " + x.ename);
        System.out.println("Company : " + First_java_program.name);
        System.out.println("Innovation : " + x.innovation);
    }
}

