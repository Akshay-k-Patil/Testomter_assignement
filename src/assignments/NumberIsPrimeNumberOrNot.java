package assignments;

import java.util.Scanner;

public class NumberIsPrimeNumberOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int number = sc.nextInt();
		System.out.println(" ");

		int z = 0;
		if (number == 0 || number == 1)
			System.out.println("The number is not prime");

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				z++;
			}
		}
		if (z == 2) {
			System.out.println("The number is prime");
		}

	}

}
