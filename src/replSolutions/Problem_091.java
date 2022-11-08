package replSolutions;

/*
Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
Create String str2= SYNTAX TECHNOLOGIES and convert into syntax technologies
Expected Output:
SYNTAX TECHNOLOGIES
syntax technologies
 */
public class Problem_091 {
    public static void main(String[] args) {

        String str1 = "syntax technologies";
        String str2 = "SYNTAX TECHNOLOGIES";

        String st = str1.toUpperCase();
        System.out.println(st);

        String st2 = str2.toLowerCase();
        System.out.println(st2);
    }
}
