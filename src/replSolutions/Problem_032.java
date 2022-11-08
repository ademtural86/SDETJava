package replSolutions;

import java.util.Scanner;

public class Problem_032 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        char gender;
        int age;

        System.out.println("Please enter your gender: M or F");
        gender=scanner.next().charAt(0);
        System.out.println("Please enter your age");
        age=scanner.nextInt();
        String out;
        if(age>25){
            if(gender=='F'){
                out="Woman";
            }else {
                out="Man";
            }
        }else{
            if(gender=='F'){
                out="Girl";
            }else {
                out="Boy";
            }
        }
        System.out.println(out);

    }
}
