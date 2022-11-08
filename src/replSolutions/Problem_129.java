package replSolutions;

/*
Declare two static variables to hold
country name
continent
Create a method to display the value of static variables in the following format:
____ located on ____ continent
In the main method assign values to a static variable and execute method display
Expected Output:
Morocco located on Africa continent
 */
public class Problem_129 {
    static String countryName;
    static String continent;

    void display() {
        System.out.println(countryName + " located on " + continent + " continent");
    }

    public static void main(String[] args) {
        countryName = "Morocco";
        continent = "Africa";

        Problem_129 m = new Problem_129();
        m.display();
    }
}
