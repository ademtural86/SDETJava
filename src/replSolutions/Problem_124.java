package replSolutions;

/*
Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
Expected Output:
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
 */
public class Problem_124 {
    static String ss = "Welcome To Syntax Technologies";


    public static void main(String[] args) {
        // first way
        System.out.println(ss);
        // second way
        System.out.println(Problem_124.ss);
        // third way
        Problem_124 m = new Problem_124();
        System.out.println(m.ss);

    }
}
