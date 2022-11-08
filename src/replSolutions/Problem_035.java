package replSolutions;

import java.util.Scanner;

public class Problem_035 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean isLoanRequired=scanner.nextBoolean();
        int creditScore;
       String out;
        if(isLoanRequired){
            System.out.println("What is your credit score?");
            creditScore=scanner.nextInt();
                    if(creditScore<600){
                        out="The eligibility is Not eligible";
                    }else if(creditScore<=700){
                        out="The eligibility is Maybe eligible";
                    }else if(creditScore<=800){
                        out="The eligibility is Eligible";
                    }else {
                        out="The eligibility is Definitely eligible";
                    }
        }else {
           out="Unknown";
        }

    }
}
