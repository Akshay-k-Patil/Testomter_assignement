package assignments;

import java.util.Scanner;

public class ConvertSquareCubeAndfourthPower {
	public static void main(String[] args) {
		// Write a Java program that reads a number and display the square, cube, and
		// fourth power
		// Square = x * x
		// Cube = x * x * X
		// Forth power = x * x * x * x

		Scanner sec = new Scanner(System.in); // Taken input from user
		System.out.println("Enter the Number:-");
		int Number = sec.nextInt();

		int square, cube, forthpower;

		square = Number * Number;
		cube = square * Number;
		forthpower = cube * Number;

		System.out.println("Square:- " + square);
		System.out.println("cube:- " + cube);
		System.out.println("Fourth power:- " + forthpower);
	}
}
