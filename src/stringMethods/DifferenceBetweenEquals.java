package stringMethods;

public class DifferenceBetweenEquals {

	public static void main(String[] args) {
		
		// The "==" operator campare the object reference, not the actual content of the object.
		
		String str1 = "Akshay";
		String str2 = "Akshay";
		String str3 = new String("Akshay");
		
		System.out.println(str1 == str2); // ans is true cz both points to the same memory location
		System.out.println(str1 == str3); // ans is false cz we use new keyword so we created the location in 

		
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		
		// The .equals(....) will compare the content of the string and the "==" operator compares the reference point of memory.
		
		String abc1 = "Automation";
		String abc2 = "Automation";
		String abc3 = new String("Automation");
		
		System.out.println(abc1.equals(abc2)); //ans is true cz content is same
		System.out.println(abc1.equals(abc3));//ans is true cz content is same
	}

}
