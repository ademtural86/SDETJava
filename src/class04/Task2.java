package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and name it Temperature Check. Create variable to store
		 * temperature. Your program should check if temperature is below 32 then it
		 * should print â€œWater will freeze with temperature â€�, otherwise â€œWater
		 * will NOT freeze with temperature â€�.
		 */
		double temperature = 35;

		if (temperature < 32) {
			System.out.println("Water will freeze with temperature " + temperature);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temperature);
		}

	}

}
