public class ConditionalStatements 
{
	public static void main (String[] args) 
	{
		boolean catWoofs = false;
		boolean dogWoofs = true;
		boolean fishCanWalk = false;
		
		// This is false.
		if (catWoofs) {
			System.out.println("Cat does woof!");
			System.out.println("THIS WILL NEVER PRINT OUT THE MESSAGE");
		}
		
		// This is true.
		if (dogWoofs) {
			System.out.println("Dog does woof!");
		}
		
		// This is false
		if (fishCanWalk) {
			System.out.println("Fish can walk!");
		}
		
		// This is true 
		if (catWoofs == false && dogWoofs == true && fishCanWalk == false) {
			System.out.println("This makes sense! Cat does not woof, dog does woof and fish cannot walk!");
		}
		
		// Same as above with different format
		if (!catWoofs && dogWoofs && !fishCanWalk) {
			System.out.println("This also makes sense!");
		}
		
		// greater than
		// greater than or equal to
		// less than
		// less than or equal to
		boolean greaterThan = 1 > 2; 				// false
		boolean greaterThanOrEqualTo = 0 >= 0;  	// true
		boolean lessThan = 1 < 2;					// true
		boolean lessThanOrEqualTo = 0 <= 0; 		// true
		
		System.out.println(greaterThan);
		System.out.println(greaterThanOrEqualTo);
		System.out.println(lessThan);
		System.out.println(lessThanOrEqualTo);
		
		// String value comparison
		String stringA = new String("A");
		String fooA = new String("A");
		
		// Reference comparison
		System.out.println(stringA == "A"); 		// false
		System.out.println(stringA == fooA); 		// false
		
		// String value comparison
		System.out.println(stringA.equals("A")); 	// true
		System.out.println(stringA.equals(fooA)); 	// true
		
	}
}
