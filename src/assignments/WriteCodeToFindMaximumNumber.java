package assignments;

import java.util.Scanner;

public class WriteCodeToFindMaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number:- ");
		int n1 = sc.nextInt();
		System.out.print("Enter the secound Number:- ");
		int n2 = sc.nextInt();
		System.out.print("Enter the third Number:- ");
		int n3 = sc.nextInt();
		System.out.println("");

		if (n1 >= n2 && n1 >= n3)
			System.out.println("The largest number is:- " + n1);
		else if (n2 >= n1 && n2 >= n3)
			System.out.println("The largest number is:- " + n2);
		else
			System.out.println("The largest number is:- " + n3);

	}

}
