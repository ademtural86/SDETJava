package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enetr your country");
		
		String country = input.nextLine();
		String yourLanguage;
		
		switch (country.toLowerCase()) {
		
		case "moldova":
			yourLanguage = "Romanian";
			break;
		case "romania":
			yourLanguage = "Romanian";
			break;
		case "usa":
			yourLanguage = "English";
			break;
		case "kazakhstan":
			yourLanguage = "Kazakh";
			break;
		case "germany":
			yourLanguage = "German";
			break;
		case "austria":
			yourLanguage = "German";
			break;
		case "italy":
			yourLanguage = "Italian";
			break;
		case "france":
			yourLanguage = "French";
			break;
		default:
			yourLanguage = "Unknown";
		}
		
		System.out.println(yourLanguage);

	}
}
