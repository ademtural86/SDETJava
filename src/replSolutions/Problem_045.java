package replSolutions;

import java.util.Scanner;

public class Problem_045 {
    public static void main(String[] args) {
        System.out.println("Input a number between 1-7");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        String out;
        switch (number){
            case 1:
                out="Monday";
                break;
            case 2:
                out="Tuesday";
                break;
            case 3:
                out="Wednesday";
                break;
            case 4:
                out="Thursday";
                break;
            case 5:
                out="Friday";
                break;
            case 6:
                out="Saturday";
                break;
            case 7:
                out="Sunday";
                break;
            default:
                out="Invalid";


        }
        System.out.println(out);

    }
}
