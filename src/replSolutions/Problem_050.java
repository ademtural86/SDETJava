package replSolutions;

/*
Step 1: Initialize the i value as int i=7.
Step 2: Write a program to print a sequence of numbers starting from 7 to 98.
Output:
7
14
21
28
35
42
49
56
63
70
77
84
91
98
 */
public class Problem_050 {
    public static void main(String[] args) {

        int i = 7;
        while (i <= 98) {
            System.out.println(i);
            i += 7;
        }
    }
}
