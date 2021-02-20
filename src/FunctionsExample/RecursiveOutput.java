package FunctionsExample;

public class RecursiveOutput {
	public static void main (String[] args) {
		RecursiveOutput output = new RecursiveOutput ();
		output.outputRecursion(5);
	}
	
	public void outputRecursion (int i)
	{
		if (i == 0) {
			return;
		}
		
		System.out.println(i);
		
		outputRecursion (i - 1);
		
		System.out.println(i);
	}
}
