package replSolutions;/*
Write a program that takes a user's name and prints it.
Example Output:
Hello, please enter your name
Your name is Sumair
 */

import java.util.Scanner;

public class Problem_024 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String userName = user.nextLine();
        System.out.println("Your name is " + userName);
    }
}
