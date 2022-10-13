package class04;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java Program to check whether number is Even or Odd
		 */

		int number=6;
		// if we take the modulus of a number by2 and answer is 0 it is always an Even number
		// otherwise it is an odd number
		
		if(number%2==0)
		{
			System.out.println("Number is Even");	
		}else
		{
			System.out.println("Number is Odd");	
		}
	}

}
