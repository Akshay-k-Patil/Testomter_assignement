package variables;

public class WhatIsLocalStaticAndInstanceVariable {


	//Local variables
	//A variable defined within a block or method or constructor is called a local variable. 
	//The scope of these variables exists only within the block in which the variables are declared,
	//i.e., we can access these variables only within that block.


	public static void main(String[] args) {
		// Declared a Local Variable
		int var = 10;

		// This variable is local to this main method only
		System.out.println("Local Variable: " + var);
	}
	
	
	//Instance variable
	//Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block. 
	//Instance variables can be accessed only by creating objects.
	//As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
	
	//Static variable
	//Static variables are also known as class variables. 
	//These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
	//Static variables are created at the start of program execution and destroyed automatically when execution ends.
	
	
}