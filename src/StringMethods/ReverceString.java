package StringMethods;
import java.util.Scanner;



public class ReverceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:- ");
		String userstring = sc.nextLine();
		System.out.println("");

		// using Recursive Approach.
		Stringreverse obj = new Stringreverse();
		obj.reverse(userstring);

		// Using Loop
		reverceusingloop obj1 = new reverceusingloop();
		obj1.reverceloop(userstring);
	}

}

class Stringreverse {

	void reverse(String userstring) {

		if ((userstring == null) || (userstring.length() <= 1))
			System.out.println(userstring);
		else {
			// here we first Retrieve the lenght using lenght() then we use the charAt which
			// give the index of the string
			System.out.print(userstring.charAt(userstring.length() - 1));
			reverse(userstring.substring(0, userstring.length() - 1));
		}

	}
}

class reverceusingloop {

	void reverceloop(String userstring) {

		int length = userstring.length();
		System.out.println("");
		System.out.print("The reverse string is:- ");
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(userstring.charAt(i));
		}

	}

}

