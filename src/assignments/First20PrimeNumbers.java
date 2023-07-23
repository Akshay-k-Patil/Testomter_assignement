package assignments;

import java.util.Scanner;

////	Write Code to get first 20 prime number? 

public class First20PrimeNumbers {

	static boolean isPrime(int num) {

		if (num == 1 || num == 0)
			return false;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0)
				return false;

		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:-");
		int num=sc.nextInt();		
		
		for (int i = 1; i <= num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");

		}
	}

}
