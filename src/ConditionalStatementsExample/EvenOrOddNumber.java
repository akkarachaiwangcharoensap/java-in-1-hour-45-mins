package ConditionalStatementsExample;

import java.util.*;

public class EvenOrOddNumber {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer to determine if it is an odd or even integer.");
		
		int number = scanner.nextInt();
			
		// If the number is odd
		if ((number % 2) == 0) {
			System.out.println("The given integer is even");
		}
		else if (!(number % 2 == 0)) {
			System.out.println("The given integer is odd");
		}
		else {
			System.out.println("THIS WILL NEVER BE PRINTED.");
		}
	}
}
