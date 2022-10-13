package class18;

class A {
    /*Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
     *Write program to inherit class A that has method printF which is static and call
     * or reuse that method into class B
     */

    static void printF() {
        System.out.println("This is from class A");
    }
}
class B extends A {

}

class C extends B {

}
public class Test {
    public static void main(String[] args) {
        B objB = new B();
        B.printF();
    String a;
    }
}




