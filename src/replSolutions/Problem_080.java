package replSolutions;

public class Problem_080 {
    public static void main(String[] args) {

        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        //Double and print array

        for (double[] doubles : a) {

            for (double aDouble : doubles) {

                System.out.print(2*aDouble + " ");
            }
            System.out.println();
        }



    }
}
