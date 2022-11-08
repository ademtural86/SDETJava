package replSolutions;/*
Write a program that asks the user's age: "Enter your age "
Then display it by adding 10 (i.e age + 10) in your final output.
Example Output:
Enter your age 30
Your age after 10 years is 40
 */

import java.util.Scanner;

public class Problem_021 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = user.nextInt();
        System.out.println("Your age after 10 years is " + (age + 10));
    }
}
