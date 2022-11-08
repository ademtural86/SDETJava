package replSolutions;

import java.util.Scanner;

public class Problem_039 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your mark");
        int marks = scanner.nextInt();
        String out;
        if(marks>=1 && marks<=25){
            out="Your grade is F";
        }else if(marks>25 && marks<=45){
            out="Your grade is E";
        }else if(marks>45 && marks<=50){
            out="Your grade is D";
        }else if(marks>50 && marks<=60){
            out="Your grade is C";
        }else if(marks>60 && marks<=80){
            out="Your grade is B";
        }else if(marks>80 &&marks<=100){
            out="Your grade is A";
        }else {
            out="Please enter valid mark";
        }
        System.out.println(out);

    }
}
