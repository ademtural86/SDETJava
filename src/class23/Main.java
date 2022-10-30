package class23;

public class Main implements Functions{

    public void display(double result){
        System.out.println("Result is ::: "+result);
    }

    public double adding(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }

    public double subtracting(double firstNumber, double secondNumber){
        return firstNumber-secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber){
        return firstNumber*secondNumber;
    }

    public double dividing(double firstNumber, double secondNumber){
        return firstNumber/secondNumber;
    }

    public static void main(String[] args){
        double firstNumber=100.00;
        double secondNumber=20.00;

        Main obj = new Main();
        obj.display(obj.adding(firstNumber, secondNumber));
        obj.display(obj.subtracting(firstNumber, secondNumber));
        obj.display(obj.multiply(firstNumber, secondNumber));
        obj.display(obj.dividing(firstNumber, secondNumber));
    }
}

interface Outputs{
    void display(double result);
}

interface Functions extends Outputs{
    double adding(double firstNumber, double secondNumber);
    double subtracting(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber, double secondNumber);
}




