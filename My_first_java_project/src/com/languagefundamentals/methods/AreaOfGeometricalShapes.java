package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to find Area's of Triangle, Square, Rectangle, & circle.
//Area of Triangle : 0.5 * Base * Height
//Area of Square : Side * Side
//Area of Rectangle : Length * Breadth
//area of Circle : PI * r * r
  
//with return_type & with parameters
public class AreaOfGeometricalShapes {

	static double getAreaOfTriangle(double base, double height) {
		double aot = 0;
		aot = 0.5 * base * height;
		return aot;
	}

	static double getAreaOfSquare(double side) {
		double square = 0;
		square = side * side;
		return square;
	}

	static double getAreaOfRectangle(double length, double breadth) {
		return length * breadth;
	}

	static double getAreaOfCircle(double r) {
		return Math.PI * r * r;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Base : ");
		double b = sc.nextDouble();

		System.out.println("Enter a Height : ");
		double h = sc.nextDouble();

		double aot = getAreaOfTriangle(b, h);
		System.out.println("Area of Triangle is : " + aot);
		System.out.println("**************************************");

		System.out.println("Enter a side : ");
		double s = sc.nextDouble();
		double Arside = getAreaOfSquare(s);
		System.out.println("Area of Square is : " + Arside);
		System.out.println("**************************************");

		System.out.println("Enter a length : ");
		double l = sc.nextDouble();
		System.out.println("Enter a breadth : ");
		double br = sc.nextDouble();
		double aor = getAreaOfRectangle(l, br);
		System.out.println("Area of Rectangle is : " + aor);
		System.out.println("**************************************");

		System.out.println("Enter a radius : ");
		double r = sc.nextDouble();
		double aoc = getAreaOfCircle(r);
		System.out.println("Area of Circle is : " + aoc);

	}

}
