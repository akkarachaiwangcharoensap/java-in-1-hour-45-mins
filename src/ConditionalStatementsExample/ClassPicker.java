package ConditionalStatementsExample;

import java.util.*;

public class ClassPicker {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please pick: 1, 2, 3, or 4 to schedule your next class.");
		
		int classNumber = scanner.nextInt();
			
		System.out.println ("You picked: " + classNumber);
		
		switch (classNumber) {
			case 1:
				System.out.println("You have selected a Math class");
				break;
			case 2:
				System.out.println("You have selected a Science class");
				break;
			case 3:
				System.out.println("You have selected a Physical Education (PE) class");
				break;
			case 4:
				System.out.println("You have selected a Computer Science class");
				break;
			default:
				System.out.println("You did not pick a class!");
				break;
		}
	}
}
