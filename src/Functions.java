
public class Functions {
	public static void main(String[] args) {
		
		Functions function = new Functions();
//		function.voidFunction();
//		System.out.println(function.integerFunction());
//		System.out.println(function.booleanFunction());
//		System.out.println(function.floatFunction());
//		System.out.println(function.doubleFunction());
//		System.out.println(function.outputArray(function.stringArrayFunction()));
//		function.recursiveFunction(5);
	}
	
	public void voidFunction () {
		System.out.println("This is a void function. It does not return anything!");
	}
	
	public int integerFunction () {
		System.out.println("This is an integer function. It returns an integer value!");
		return 1 + 1;
	}
	
	public boolean booleanFunction () {
		System.out.println("This is a boolean function. It returns a boolean value!");	
		return true;
	}
	
	public float floatFunction () {
		System.out.println("This is a float function. It returns a float value!");
		return 1.2f + 1.5f;
	}
	
	public double doubleFunction () {
		System.out.println("This is a double function. It returns a double value!");	
		return 2.245 + 1.2345;
	}
	
	public String[] stringArrayFunction () {
		System.out.println("This is a string array function. It returns an array string object!");	
		return new String[] {"Hello", "I", "Am", "Aki"};
	}
	
	public void functionWithArguments (String name, String country) {
		System.out.println ("Hello " + name + " !");
		System.out.println ("I see you that live in " + country + "!");
		System.out.println ("Awesome!");
	}
	
	public String outputArray(String[] items) {
		String output = "";
		for (int i = 0; i < items.length; i++) {
			output += items[i];
					
			if (i < items.length - 1) {
				output += ", ";
			}
		}
		
		return output;
	}
	
	public void recursiveFunction (int i) {
		if (i == 0) {
			return;
		}
		
		this.recursiveFunction(i - 1);
		
		System.out.println ("Printing from: " + i);
	}
}
