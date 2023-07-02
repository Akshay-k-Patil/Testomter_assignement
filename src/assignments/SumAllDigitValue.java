package assignments;

import java.util.Scanner;

public class SumAllDigitValue {

	public static void main(String[] args) {

		/*
		 * suppose value a = 234 
		 * sum = 2+3+4 = 9 
		 * sum should be 9
		 */

		int number, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		number = sc.nextInt();
		System.out.println("");

		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println("Sum of digit is:- " + sum);

	}

}
