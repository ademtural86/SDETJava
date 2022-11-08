package replSolutions;

/*
Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
for the addition method add two numbers to make 30
for multiplication multiply two numbers to make 30
for Subtraction subtract two numbers to equal 20
Expected Output:
Addition 30
Multiplication 30
Subtraction 20
 */
public class Problem_114 {
    public static void main(String[] args) {
        Problem_114 m = new Problem_114();

        System.out.println("Addition " + m.addition(10, 20) + " ");
        System.out.println("Multiplication " + m.multiplication(3, 10) + " ");
        System.out.println("Subtraction " + m.subtraction(30, 10) + " ");
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

}
