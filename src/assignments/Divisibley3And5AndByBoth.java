package assignments;

public class Divisibley3And5AndByBoth {
	
	public static void main(String[] args) {

		System.out.print("Divided by 3:-");
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				System.out.print(" " + i);
				System.out.print("");
			}
		};

		System.out.println("");
		System.out.print("Divided by 5:-");
		for (int i = 1; i <= 100; i++) {

			if (i % 5 == 0) {
				System.out.print(" " + i);
			}
		};

		System.out.println("");
		System.out.print("Divided by 5 and 3:-");
		for (int i = 1; i <= 100; i++) {

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(" " + i);
			}
		};
	
	}

}
