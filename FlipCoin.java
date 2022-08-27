package com.basicprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   // Scanner->class, scanner-> type object
		System.out.println("Enter the number to flip coin = ");
		
		int numberOfTimes = scanner.nextInt();
		int tail=0;
		int head=0;
		// Java Math.random() returns a random value between 0.0 and 1.0 each time.
		//If value is below 0.5 then it's Heads or otherwise Tails.

		
		if (numberOfTimes >0) {
			for (int i = 0; i < numberOfTimes; i++) {
				double value = Math.random();
				if (value < 0.5) {
					tail++;
				}else {
					head++;
				}
			}
			double percentageOffHead = (head*100)/numberOfTimes;
			double percentageOfTails = (tail*100)/numberOfTimes;
			System.out.println("Head Count = " +head);
			System.out.println("Tail Count = "+tail);
			System.out.println(percentageOffHead);
			System.out.println(percentageOfTails);
			
			}
		 scanner.close();
	}

}
