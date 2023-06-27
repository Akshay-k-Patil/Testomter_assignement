package assignments;

import java.util.Scanner;

public class SumDifferenceProductAverageDistanceMaximumAndMinimum {

	public static void main(String[] args) {
	// Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the
	// distance (the difference between integer),the maximum (the larger of the two integers), the minimum (smaller of the two integers).
	// Sum = n1 + n2 // difference = n1 - n2 // product = n1 * n2 
	// average = (n1+n2)/2	// distance = // maximum = // minimum =

				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the first Number:- ");
				int n1 = sc.nextInt();
				System.out.print("Enter the secound Number:- ");
				int n2 = sc.nextInt();
				System.out.println("");

				// Calculate the sum
				int sum = n1 + n2;
				System.out.println("The sum of " + n1 + " and " + n2 + " is " + sum);
				System.out.println("");

				// Calculate the difference
				int difference = n1 - n2;
				System.out.println("The difference between " + n1 + " and " + n2 + " is " + difference);
				System.out.println("");
			
				// calculate the product
				int product = n1 * n2;
				System.out.println("The product between " + n1 + " and " + n2 + " is " + product);
				System.out.println("");
				
				// Calculate the average
				int average = (n1 + n2) / 2;
				System.out.println("The average of " + n1 + " and " + n2 + " is " + average);
				System.out.println("");
				
				// maximum number
				if (n1 > n2) {
					System.out.println("The maximum number is " + n1);
					System.out.println("");
				}
				else if (n1 < n2) {
					System.out.println("The maximun number is " + n2);
					System.out.println("");
				}
				else {
					System.out.println("Both numbers are equal");
					System.out.println("");
				}

				// minimum number
				if (n1 < n2) {
					System.out.println("The miniumum number is " + n1);
					System.out.println("");
				}
				else if (n1 > n2) {
					System.out.println("The miniumum number is " + n2);
					System.out.println("");	
				}
				else {
					System.out.println("Both numbers are equal");
					System.out.println("");
				}
			}


	}


