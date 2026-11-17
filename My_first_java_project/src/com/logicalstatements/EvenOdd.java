package com.logicalstatements;

import java.util.Scanner;

//2.Check whethe2r a number is even or odd.
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
		sc.close();
	}

}
