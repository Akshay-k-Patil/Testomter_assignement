package assignments;

public class Make17withAvailableOperators {

//	You have given below number and operators//
//	number - 1,2,6,7
//	operators - +,-,*
//	You can't repeat any number
//	and you can't skip any operator and number
//	You have to create 17 using above rule

	public static void main(String[] args) {

		int a = 6, b = 1, c = 2, d = 7;

		// Here the executions will done from left to right
		// BODMAS rule applied first the bracket will execute then multiplication and
		// then addition
		int sum = ((a - b) * c) + d;
		System.out.println(sum);

	}

}
