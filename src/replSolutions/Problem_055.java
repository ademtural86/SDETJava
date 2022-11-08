package replSolutions;

/*
Create a for loop that prints out even numbers from 10 to 0
Must not include the number 0 in the output
Output:
10
8
6
4
2
 */
public class Problem_055 {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
