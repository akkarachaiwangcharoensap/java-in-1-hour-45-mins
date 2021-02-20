package ConditionalStatementsExample;

import java.util.*;

public class LetterGrade {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter percentage value to determine your letter grade.");
		
		int percentage = scanner.nextInt();
			
		if (percentage >= 86) {
			System.out.println("You got an A");
		}
		else if (percentage >= 73) {
			System.out.println("You got a B");
		}
		else if (percentage >= 50) {
			System.out.println("You got a C");
		}
		else {
			System.out.println("You are failing... That is unfortunate...");
		}
	}
}
