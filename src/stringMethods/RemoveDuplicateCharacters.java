package stringMethods;

import java.util.Scanner;

/*Write Code to remove all duplicates from input String?
Eg:
input="aaabcbabcbabbc"
output=abc

Note: as all duplicates for a, b and c is removed. */

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the statement :- ");
		String st = sc.nextLine();
		System.out.println(removeDuplicateChar(st));

	}

	public static String removeDuplicateChar(String a) {
		String afterstring = "";
		int j = 0;

		for (int i = 0; i < a.length(); i++) {
			for (j = 0; j < i; j++) {
				if (a.charAt(i) == a.charAt(j)) {
					break;
				}
			}
			if (i == j) {
				afterstring = afterstring + a.charAt(i);
			}
		}
		return afterstring;
	}

}
