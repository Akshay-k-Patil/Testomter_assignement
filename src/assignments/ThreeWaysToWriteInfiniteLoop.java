package assignments;

public class ThreeWaysToWriteInfiniteLoop {
	
	public static  void exampleforloop() {
		for ( ; ; ) {
			System.out.println("Hello World ");
		}
	}
	
	public static void examplewhileloop() {
		while (true) {
			System.out.println("Hello World"); 
		}
	}	
	
	public static void exampledowhile() {
		do{
			System.out.println("Hello do while");
		}while(true);
	}

}
