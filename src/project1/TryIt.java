package project1;

public class TryIt {

    String name="Adem";

    static String schoolName="Leuven University";

    public static void main(String[] args) {
        TryIt object1= new TryIt();
        TryIt object2= new TryIt();
        TryIt object3= new TryIt();

        object1.name="Ruslan";
        object2.name="Guljan";
        object3.name="Diana";

        schoolName="Ghent University";
        System.out.println(schoolName);

    }
}
