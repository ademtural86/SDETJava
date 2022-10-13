package class10;

public class HW1 {

	public static void main(String[] args) {

		/*
		 * From an array of integer elements find the largest number.
		 * 
		 */

		int[] num = { 100, 400, 3000, 10 };
		
		int largestnum = num[0];
		
		for(int n:num) {
			
			if(n>largestnum) {
				largestnum=n;
			}
		}
		
		System.out.println(largestnum);
		
		System.out.println(" -----------------  ");
		
		largestnum = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largestnum) {
				largestnum = num[i];
			}
		}
		System.out.println(largestnum);
	}
}
