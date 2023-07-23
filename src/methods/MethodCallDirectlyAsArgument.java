package methods;

//If we add print the and then we will get the and is 100;
//Here main method is missing from the class because of that the user is not able to run the code.

public class MethodCallDirectlyAsArgument {

	public static void main(String[] args) {

	}

}

class A {

	public static void main(String[] args) {

	}

	public int add(int i, int j) {

		return i + j;

	}

}

class B {

	public static void main(String[] args) {

		A a1 = new A();

		a1.add(a1.add(10, 20), a1.add(30, 40));

	}

}
