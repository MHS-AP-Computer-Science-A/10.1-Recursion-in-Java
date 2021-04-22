
public class RecursionInJava {

	public static void main(String[] args) {
		System.out.println(f(6));
		
		System.out.println(sum(6));

	}

	public static int f(int x) {
		if (x > 0)
			return 3 * f(x - 1);
		else
			return 2;
	}

	public static int sum(int n) {
		// This is the base case.
		if (n == 1) {
			return 1;
		}
		// This is the recursive call
		return n + sum(n - 1);
	}

}
