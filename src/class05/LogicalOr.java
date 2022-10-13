package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "saturday";

		if (day.equals("saturday") || day.equals("sunday")) {
			System.out.println("I have Java class at Syntax - using logical OR");
		}

		System.out.println(" ------------------------");
		
		if (day.equals("saturday") && day.equals("sunday")) {
			System.out.println("I have Java class at Syntax - using logical AND");
		}
		
		System.out.println(" ---------------------  ");
		
		double money = 90000;
		String title="Automation Tester";
		
		if(title.equals("Automation Tester") || money ==120000) {
			System.out.println("Happy");
		}
		
	}
}
