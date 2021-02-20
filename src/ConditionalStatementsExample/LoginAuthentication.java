package ConditionalStatementsExample;

import java.util.*;

public class LoginAuthentication {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name and password.");
		
		String name = scanner.nextLine();
		String password = scanner.nextLine();
		
		if (name.equals("Aki") && password.equals("password")) {
			System.out.println("Hello there, " + name + "!");
		}
		else {
			System.out.println("ERROR: The credentials do not exist");
		}
	}
}
