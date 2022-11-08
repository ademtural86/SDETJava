package replSolutions;

/*
Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;
Expected Output:
3
 */
public class Problem_126 {
    static int count;

    public static void main(String[] args) {

        Problem_126 m = new Problem_126();
        count++;
        Problem_126 x = new Problem_126();
        count++;
        Problem_126 v = new Problem_126();
        count++;

        System.out.println(count);

    }

}
