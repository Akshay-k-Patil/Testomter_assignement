package assignments;

import java.util.Scanner;

//Write Code to get Armstrong number? 

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num, originalnumber, remainder, result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		num = scanner.nextInt();

		originalnumber = num;
		while (originalnumber > 0) {
			
			//remainder contains the last digit
			remainder = originalnumber % 10;
			result = result + remainder * remainder * remainder;
			
			// removing last digit from the orignal number
			originalnumber = originalnumber / 10;
		}
		if (result == num)
			System.out.println("Is an Armstrong number " + num);
		else
			System.out.println("Is not an Armstrong number " + num);
	}
}
