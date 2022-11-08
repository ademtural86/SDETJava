package replSolutions;/*
Write a program to take user name, age and mobile number
First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"
Example Output:
Enter your name
Enter your mobile number
Enter your age
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
 */

import java.util.Scanner;

public class Problem_022 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Enter your mobile number");
        System.out.println("Enter your age");
        String name = user.nextLine();
        String number = user.nextLine();
        int age = user.nextInt();

        System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + number);
    }
}
