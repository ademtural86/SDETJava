package replSolutions;

/*
Create a method that will accept a String as a parameter and return new String all in upper case
Call method
Expected Output:
TEST
 */
public class Problem_115 {
    public static void main(String[] args) {
        System.out.println(newUpperCaseString("test"));
    }

    public static String newUpperCaseString(String newS) {
        return newS.toUpperCase();
    }
}
