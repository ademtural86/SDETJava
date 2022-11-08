package replSolutions;

/*
Write a program to print the perimeter and area of a rectangle with width = 5 and height = 8.
**Output:**
The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __
 */
public class Problem_011 {
    public static void main(String[] args) {

        int rWidth = 5;
        int rHeight = 8;

        int perimeter = rHeight + rHeight + rWidth + rWidth;
        int area = rWidth * rHeight;

        System.out.println("The perimeter of a rectangle with width" + " " + rWidth + " and height" + " " + rHeight + " is equals to" + " " + perimeter + " and the area equals to" + " " + area);

    }
}
