package replSolutions;

/*
Using do while loop print even numbers from 20 to 1
Expected Output:
20
18
16
14
12
10
8
6
4
2
 */
public class Problem_053 {
    public static void main(String[] args) {

        int i = 20;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        } while (i >= 1);
        {

        }
    }
}
