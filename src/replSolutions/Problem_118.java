package replSolutions;

/*
Write a method header on line two with the following specs:
Returns:
a String
Name:
spaceOut
Parameters:
a String
Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).
Examples:
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "
 */
public class Problem_118 {
    public static String spaceOut(String s) {
        for (int i = 0; i < s.length(); i++) {
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.print(spaceOut("hello").replace("", " "));
        System.out.println();
        System.out.print(spaceOut("technology").replace("", " "));
    }
}
