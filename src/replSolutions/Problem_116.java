package replSolutions;

/*
Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
( Return false if one or both given numbers are not even)
Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false
Expected Output:
false
 */
public class Problem_116 {
    public static void main(String[] args) {
        System.out.println(numbers(3, 4));
    }

    public static boolean numbers(int a, int b) {

        if (a % 2 == 0 && b % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
