package stringMethods;

import java.util.Scanner;

public class SumOfOnlyNumbersInString {

	public static void main(String[] args) {

		int sum = 0;
		String currentNumber = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the statement:- ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			
			if (Character.isDigit(currentChar)) {
				currentNumber = currentNumber + currentChar;
				
			} else if (!currentNumber.isEmpty()) {
				sum = sum + Integer.parseInt(currentNumber);
				currentNumber = "";
			}
		}

		// Add the last number if present
		if (!currentNumber.isEmpty()) {
			sum = sum + Integer.parseInt(currentNumber);
		}
		System.out.println(sum);
	}

}
