package stringMethods;

import java.util.Scanner;

public class FindAllCharactersInGivenString {

//	input="this is java"
//	output=10
//	Note:Space has been removed
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the statement:- ");
		String ch = sc.nextLine();
		ch = ch.replace(" ", "");

		int count = 0;
		for (int i = 0; i < ch.length(); i++) {
			if (ch.charAt(i) != ' ')
				count++;
		}
		System.out.println("The count of characters are:- " +count);

	
	}

}
