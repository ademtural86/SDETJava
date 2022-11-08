package replSolutions;

import java.util.Scanner;
/*
Create an int array of integers with a size of 5 and input values with Scanner.
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below
Example:
Input:
1
2
3
4
5
Output:
10
20
30
40
50
 */
public class Problem_078 {
    public static void main(String[]args){

        int []array=new int[5];

        Scanner scan=new Scanner(System.in);

        for(int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        for(int i=0;i<array.length;i++){

            System.out.println(array[i]+"0");

        }
    }
}
