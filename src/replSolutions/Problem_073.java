package replSolutions;

/*
Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} and prints all values in one line.
**Output:**
This is array of strings
 */
public class Problem_073 {
    public static void main(String[] args) {

        String[] array = {
                "This", "is", "array", "of", "strings"
        };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
