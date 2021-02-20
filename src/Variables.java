import java.util.*;

public class Variables {
	public static void main (String[] args)
	{
		// Primitive data types
		byte myByte = 64; 				// 8-bit  | min: -128 | max: 127
		short myShort = 123; 			// 16-bit | min: -32,768 | max: 32,767
		int myInteger = 64; 			// 32-bit | min: (-2^31) | max: (2^31)-1
		float myFloat = 12.623333f; 	// 32-bit
		double myDouble = 12.623333; 	// 64-bit
		char myCharacter = 'a'; 		// 16-bit | single string character, 
		boolean myBoolean  = false;		// true or false only. (1, 0)
		
		// Non-primitive data types
		int[] myIntegerArray = new int[] {1,2,3,4,5,6,7,8,9,0};
		String myString = "a"; // String object
		String[] myArrayString = new String[] {"my", "String"}; // String array object
		Scanner myScanner = new Scanner(System.in); // Scanner object
		
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInteger);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myCharacter);
		System.out.println(myBoolean);
	}
}
