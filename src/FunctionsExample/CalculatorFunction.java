package FunctionsExample;

public class CalculatorFunction {
	public static void main(String[] args) {
		CalculatorFunction calculator = new CalculatorFunction ();
		System.out.println(calculator.add(1, 1));
		System.out.println(calculator.subtract(1, 1));
		System.out.println(calculator.multiply(1, 1));
		System.out.println(calculator.divide(1, 1));
		System.out.println(calculator.modulus(1, 1));
	}
	
	public int add (int a, int b) {
		return a + b;
	}
	
	public int subtract (int a, int b) {
		return a - b;
	}
	
	public int multiply (int a, int b) {
		return a * b;
	}
	
	public int divide (int a, int b) {
		return a / b;
	}
	
	public int modulus (int a, int b) {
		return a % b;
	}
}
