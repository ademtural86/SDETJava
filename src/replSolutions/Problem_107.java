package replSolutions;

/*
How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"
Expected Output:
sdneirF olleH
 */
public class Problem_107 {
    public static void main(String[] args) {

        String text = "Hello Friends";

        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println(stringBuilder.reverse());

    }
}
