package assignments;

public class FibonacchiSeries {
	public static void main(String[] args) {
		
		int i = 1, n = 10, FirstNum = 0, secoundnum = 1;
		System.out.println("Fibonacchi Series till " + n + " terms:");

		while (i <= n) {
			System.out.print(FirstNum + " ");

			int nextTerm = FirstNum + secoundnum;
			FirstNum = secoundnum;
			secoundnum = nextTerm;

			i++;

		}
	}
}
