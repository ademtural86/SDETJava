package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have credit card? Answer true or false.");
		boolean result = scanner.nextBoolean();
		
		if (result) {
			
			System.out.println("What is the balance on your card?");
			int balance = scanner.nextInt();
			
			if (balance > 1000) {
				System.out.println("You need to pay immidiately");
			} else {
				System.out.println("You can spend more");
			}
			
		} else {
			System.out.println("We have a great offer right now!");
		}

	}

}
