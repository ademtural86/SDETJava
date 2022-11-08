package replSolutions;/*
Write a program to take values of length and width from the user.
Based on value define whether the shape is a square or rectangle.
Examples:
Please enter the length 18
Please enter the width 16
The shape of your object is rectangle

Please enter the length 16
Please enter the width 16
The shape of your object is square
 */

import java.util.Scanner;

public class Problem_028 {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = values.nextInt();
        System.out.println("Please enter the width");
        int width = values.nextInt();

        if (length != width) {
            System.out.println("The shape of your object is rectangle");
        } else {
            System.out.println("The shape of your object is square");
        }
    }
}
