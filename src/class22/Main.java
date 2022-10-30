package class22;

class Main  implements FirstInterface, SecondInterface{
    public void firstMethod(){
        System.out.println("First Method implementing multiple Inheritance");
    }

    public void secondMethod(){
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.firstMethod();
        obj.secondMethod();

    }
}

interface FirstInterface{
    void firstMethod();
}

interface SecondInterface{
    void secondMethod();
}
