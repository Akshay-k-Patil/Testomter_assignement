package assignments;

import java.util.Scanner;

public class FindNumberOfDaysInAMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number:- ");
		int n1 = sc.nextInt();

		if (n1 >= 0) {

			if (n1 == 1 || n1 == 3 || n1 == 5 || n1 == 7 || n1 == 8 || n1 == 10 || n1 == 12) {
				System.out.println("31");
			} else if (n1 == 2 || n1 == 6 || n1 == 9 || n1 == 11) {
				System.out.println("30");
			} else if (n1 > 12) {
				System.out.println("Enter the correct number of month");
			} else {
				System.out.println("28 0r 29");
			}
		} else {
			System.out.println("Enter the correct number of month");
		}
	}

}
