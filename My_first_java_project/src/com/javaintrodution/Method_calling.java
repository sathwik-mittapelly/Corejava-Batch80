/*
Java:

1.Write a Java program to create two static methods (method1() and method2()) and two instance methods (method3() and method4()). 
Each method should print its own data. Call only one method inside the main() method and ensure that all four methods are executed and their data is printed.

*/
package com.javaintrodution; // lab


public class Mehtod_calling {

    // Static method 1: Prints data and calls method2()
    static void method1() {
        System.out.println("This is static method1");
        method2();
    }

    // Static method 2: Prints data, creates an object, and calls method3()
    static void method2() {
        System.out.println("This is static method2");

        // Creating an object of the class
        Mehtod_calling a = new Mehtod_calling();
        a.method3(); // Calling the instance method using the object reference
    }

    // Instance method 3: Prints data and calls method4()
    void method3() {
        System.out.println("This is instance method3");
        method4();
    }

    // Instance method 4: Prints data
    void method4() {
        System.out.println("This is instance method4");
    }

    // Main method: Calls only one method directly
    public static void main(String[] args) {
        method1();
    }
}
