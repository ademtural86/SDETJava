package replSolutions;

/*
Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
Call both methods
Expected Output:
newLine method implementation
displayLine method implementation
 */
public class Problem_110 {
    public static void main(String[] args) {
        Problem_110 m = new Problem_110();
        m.newLine();
        m.displayLine();
    }

    void newLine() {
        System.out.println("newLine method implementation");
    }

    void displayLine() {
        System.out.println("displayLine method implementation");
    }
}
