package replSolutions;

/*
Write a program to print values from a 2D array
Example Output:
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6
 */
public class Problem_079 {
    public static void main(String[] args) {
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };

        for (double[] doubles : a) {

            for (double aDouble : doubles) {

                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }
}
