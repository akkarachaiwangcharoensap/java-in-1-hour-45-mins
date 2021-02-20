package FunctionsExample;

public class FactorialFunction {
	public static void main (String[] args) {
		
		FactorialFunction function = new FactorialFunction ();
		int result = function.factorial(5); // 5! = 5 * 4 * 3 * 2 * 1 = 120
		System.out.println (result);
	}
	
	public int factorial (int i) {
		if (i == 0) {
			return 1;
		}
		
		return i * factorial(i - 1);
	}
}
