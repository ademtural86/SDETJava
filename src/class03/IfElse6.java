package class03;

public class IfElse6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=19;
		
		if(number!=18) {
			System.out.println("this number is not 18");
		}
		
		int day=10;
		
		if(day==1) {
			System.out.println("Monday");
		} else if(day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		} else if(day==4) {
			System.out.println("Thursday");
		} else if(day==5) {
			System.out.println("Friday");
		}else if(day==6) {
			System.out.println("Saturday");
		}else if(day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Please enter a valid day number(1-7)");
		}
		
	}

}
