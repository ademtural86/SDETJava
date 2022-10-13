package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
		for(int i=1; i<4; i++){
			
			for(int j=0; j<=2; j++) {
					System.out.println("Hello");
					break;
			}
			System.out.println("Bye");
		}
		System.out.println("  ------    ");
		
		boolean day=true;
		
		for(int i=1;i<=3; i++) {
			
			while(day) {
				System.out.println("Good Day");
				break;
			}
			
			System.out.println(i);
		}

	}
}
