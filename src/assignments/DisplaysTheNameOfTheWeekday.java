package assignments;

import java.util.Scanner;

public class DisplaysTheNameOfTheWeekday {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int day = sc.nextInt();

		if (day == 1) {
			System.out.println("Today is sunday");
		} else if (day == 2) {
			System.out.println("Today is Monday");
		} else if (day == 3) {
			System.out.println("Today is Tuesday");
		} else if (day == 4) {
			System.out.println("Today is Wednesday");
		} else if (day == 5) {
			System.out.println("Today is Thursday");
		} else if (day == 6) {
			System.out.println("Today is Friday");
		} else if (day == 7) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Enter the correct number");
		}
	
	}

}
