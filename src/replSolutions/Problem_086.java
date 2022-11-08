package replSolutions;

/*
Create a class 'Main' (please do not make it public as Repl will give you an error)
Inside class declare a String variable 'name' and integer variable 'roll_no'.
Create an object of the class and assign the value of 2 to roll_no and value of "John" to name
Your program should print the following:
Name is John and roll number is 2
 */
public class Problem_086 {
    String name;
    int roll_no;

    public static void main(String[] args) {

        Problem_086 m = new Problem_086();

        m.roll_no = 2;
        m.name = "John";
        System.out.print("Name is " + m.name + " and roll number is " + m.roll_no);

    }
}
