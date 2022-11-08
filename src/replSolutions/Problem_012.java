package replSolutions;

/*
For you to do:
Add num1 and num2
Divide the result by num3
Subtract num4 from that result
Instructions: Please use variables to assign the result of arithmetic operations
Output:
The result of arithmetic operations is equal to ___
 */
public class Problem_012 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;
        int num3 = 5;
        int num4 = 1;

        //start coding here

        int addNum=num1+num2;
        int divNum=addNum/num3;
        int subNum=divNum-num4;

        System.out.println("The result of arithmetic operations is equal to "+" "+subNum);

    }
}
