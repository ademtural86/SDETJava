package replSolutions;

/*
Create a method in which you will be printing numbers from 1 to 10
Call the method in the main method
Expected Output:
1
2
3
4
5
6
7
8
9
10
 */
public class Problem_112 {
    public static void main(String[] args) {
        Problem_112 m = new Problem_112();
        m.numbers();
    }

    void numbers() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}
