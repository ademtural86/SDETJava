package replSolutions;

/*
Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."
The second method should be a static method that will print out the following message:
"Java is awesome."
Execute both methods
Expected Output:
Programming is amazing.
Java is awesome.
 */
public class Problem_127 {
    void m1() {
        System.out.println("Programming is amazing.");
    }

    static void m2() {
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {

        Problem_127 m = new Problem_127();
        m.m1();
        m2();

    }
}
