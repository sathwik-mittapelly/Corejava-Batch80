package com.javaintrodution; // own

// Static and Instance Variables – Declaration, Initialization, and Accessing in Java
public class Mystudent {

    // Instance variables - Declaration
    String rollNo;
    String name;

    // Static variable - Declaration
    static String college;

    public static void main(String[] args) {

        // Static variable - Initialization
        college = "IARE College";

        // Accessing static variable using class name
        System.out.println("College: " + Mystudent.college);
        
        // Creating object
        Mystudent s1 = new Mystudent();

        // Instance variable - Initialization
        s1.rollNo = "22951A1280";
        s1.name = "Sathwik";
        
        // Accessing instance variables
        System.out.println("Roll no: " + s1.rollNo);
        System.out.println("Name: " + s1.name);

       
    }
}
