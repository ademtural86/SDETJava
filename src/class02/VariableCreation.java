package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {

		// 1 way to create a variable
		byte b = 10; // create a variable and assign value

		// 2 way to create a variable
		int i; // create a variable
		i = 100; // assign value

		// we need to create a variable only once
		// then we can use as many times we want/need during the program

		// 3 way
		//create a variable or declare a variable
		int num1, num2, num3; 

		num1 = 100; // assign value or initialize variable
		num2 = 200; //assign the value
		num3 = 300;
		//int num1=100; error -> duplicate variable
		
		// ? Can I change a value of a variable???
		System.out.println(num2); //200
		num2=2000; //reassign the value
		System.out.println(num2); //2000
		
		// 1 variable can hold only 1 value at 1 time/per line 
		boolean boo=true;
		boo=false;
		boo=true;
	}
}
