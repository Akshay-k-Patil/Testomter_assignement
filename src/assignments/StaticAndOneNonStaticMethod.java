package assignments;



public class StaticAndOneNonStaticMethod {

	public static void main(String[] args) {
		System.out.println("Using static "+ StaticAndOneNonStaticMethod.add1(5, 10));
		StaticAndOneNonStaticMethod cc= new StaticAndOneNonStaticMethod();
		System.out.println("Using without static "+ cc.add(5, 11));
		
	}

	
	public static int add1(int i, int j) {
		int k = i + j;
		return k;
		
	}

	public int add(int i, int j) {

		int k = i + j;

		return k;

	}
}
