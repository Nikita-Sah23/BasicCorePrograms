package com.basicprograms;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("Enter the first number ");
		 int a = scanner.nextInt();
		 
		 Scanner scanner1 = new Scanner (System.in);
		 System.out.println("Enter the second number ");
		 int b = scanner.nextInt();
		
		
	//	int a = 520;
	//	int b = 10;
		
		System.out.println("Quotient is " + a / b );
		
		System.out.println("Remainder is " + a % b);
	}

}
