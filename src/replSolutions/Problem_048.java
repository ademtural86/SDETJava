package replSolutions;

/*
Using while loops that print out even numbers from 1 to 13
**Example Output:**
2
4
6
8
10
12
 */
public class Problem_048 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 13) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
