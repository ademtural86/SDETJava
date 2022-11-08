package replSolutions;

/*
Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
Expected Output:
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */
public class Problem_087 {
    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {

        Problem_087 m = new Problem_087();
        Problem_087 x = new Problem_087();

        m.carColor = "Black";
        m.carYear = 2019;
        m.carMake = "BMW";

        x.carColor = "White";
        x.carYear = 2018;
        x.carMake = "Toyota";

        System.out.println("Car color is " + m.carColor + " and car year is " + m.carYear + " and car model is " + m.carMake);
        System.out.println("Car color is " + x.carColor + " and car year is " + x.carYear + " and car model is " + x.carMake);

    }
}
