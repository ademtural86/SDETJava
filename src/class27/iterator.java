package class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Main {
    static boolean isPrime(int number)
    {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }
    public static void main(String[] args){
        LinkedList<Integer> primeNumbers = new LinkedList<>();

        for(int i=0; i<=100; i++){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }
}
