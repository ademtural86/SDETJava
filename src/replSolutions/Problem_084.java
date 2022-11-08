package replSolutions;

/*
Write a program that prints the total number of elements that are negative AND odd
Output:
3
 */
public class Problem_084 {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int counter = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] % 2 == -1) {
                    counter++;
                }
            }
        }
        System.out.print(counter);
    }
}
