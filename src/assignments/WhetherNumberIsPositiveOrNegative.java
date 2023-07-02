package assignments;

import java.util.Scanner;

public class WhetherNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number:- ");
		int n1 = sc.nextInt();
		System.out.println("");

		if (n1 > 0)
			System.out.println("The entered number is positive " + n1);
		else if (n1 < 0)
			System.out.println("The entered number is negative " + n1);
		else
			System.out.println("The entered number is zero " + n1);

	}

}
