package class04;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		// we use nextInt() if we want an int type of data from the keyboard
		System.out.println("Please enter your age");
		int age=scanner.nextInt(); 
		
		if(age<18)
		{
			System.out.println("You should study");
		}else {
			System.out.println("You should start working");
		}

	}

}
