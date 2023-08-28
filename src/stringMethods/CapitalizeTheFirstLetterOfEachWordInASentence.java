package stringMethods;

import java.util.Scanner;

public class CapitalizeTheFirstLetterOfEachWordInASentence {
	public static void main(String[] args) {

		String capitalizedword = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:- ");
		String st = sc.nextLine();

		String[] string = st.split(" ");

		for (String s : string) {
			String firstword = s.substring(0, 1);
			String afterword = s.substring(1);
			capitalizedword = capitalizedword + firstword.toUpperCase() + afterword + " ";
		}
		System.out.println(capitalizedword);
	}

}
