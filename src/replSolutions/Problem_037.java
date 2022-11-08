package replSolutions;

import java.util.Scanner;

public class Problem_037 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean isThirsty=scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean isSleepy=scanner.nextBoolean();
        String out;
        if(isThirsty &&!isSleepy){
            out="Looks like you need to drink water";
        }else if(isThirsty){
            out="Looks like you need to drink coffee";

        }else if(isSleepy){
            out="Looks like you need to drink tea";

        }else {
           out="Looks like you need to drink nothing";

        }
        System.out.println(out);
    }
}
