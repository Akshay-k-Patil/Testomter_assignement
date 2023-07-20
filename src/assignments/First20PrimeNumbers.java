package assignments;

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
		int num = 80;
		for (int i = 1; i <= num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");

		}
	}

}
