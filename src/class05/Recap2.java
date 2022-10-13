package class05;

public class Recap2 {

	/* to format code use 
	 *  
	 *  mac: cmd+shift+f
	 *  windows: ctrl+shift+f
	 */
	
	public static void main(String[] args) {

		boolean allergy = false;
		String allergyType = "pollen";

		if (allergy) {
			System.out.println("Let's check what allergy you have");

			if (allergyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay indoors when trees are blloming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy produtcs");
			}else {
				System.out.println("We need to do some test");
			}
			
		} else {
			System.out.println("You are lucky");
		}
	}
}
