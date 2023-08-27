package stringMethods;

import java.util.Arrays;
import java.util.Scanner;


public class AnagramForAString {
	
/*	Anagram : a word, phrase, or name formed by rearranging the letters of another
	Eg : apple (a = 1 , p = 2, l = 1 , e = 1)
	possible anagram : pplea (a = 1 , p = 2, l = 1 , e = 1), pleap (a = 1 , p = 2, l = 1 , e = 1)
*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string:- ");
		String string1 = sc.nextLine();
		System.out.print("Enter the secound string:- ");
		String string2 = sc.nextLine();
		AnagramForAString an = new AnagramForAString();
		an.isAnagram(string1, string2);
	}
	
	public static void isAnagram(String st1, String st2) {

		// Checking the length of both stings
		if (st1.length() == st2.length()) {

			// Convert String to charArray
			char[] charArray1 = st1.toCharArray();
			char[] charArray2 = st2.toCharArray();

			// Sort the characters of string
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// checking the sort array is Anagram or not
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(st1 + " and " +st2+ " string are Aragram");
			} else {
				System.out.println(st1 + " and " +st2+ " string are not Aragram");
			}
		} else {
			System.out.println(st1 + " and " +st2+ " Both string are Aragram");
		}
	}

}
