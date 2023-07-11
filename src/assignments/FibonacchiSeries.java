package assignments;

public class FibonacchiSeries {
	public static void main(String[] args) {
		
		int i = 1, n = 10, FirstTerm = 0, secoundterm = 1;
		System.out.println("Fibonacchi Series till " + n + " terms:");

		while (i <= n) {
			System.out.print(FirstTerm + " ");

			int nextTerm = FirstTerm + secoundterm;
			FirstTerm = secoundterm;
			secoundterm = nextTerm;

			i++;

		}
	}
}
