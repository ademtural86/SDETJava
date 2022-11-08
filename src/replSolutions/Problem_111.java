package replSolutions;

/*
Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
Call both methods
Expected Output:
Welcome to Syntax Technologies!
Welcome Syntax Students!
 */
public class Problem_111 {
    public static void main(String[] args) {
        Problem_111 m = new Problem_111();
        m.syntaxTechnologies();
        m.syntaxStudents();
    }

    void syntaxTechnologies() {
        System.out.println("Welcome to Syntax Technologies!");
    }

    void syntaxStudents() {
        System.out.println("Welcome Syntax Students!");
    }
}
