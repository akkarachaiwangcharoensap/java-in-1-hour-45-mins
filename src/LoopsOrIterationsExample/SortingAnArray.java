package LoopsOrIterationsExample;

public class SortingAnArray {
	public static void main (String[] args)
	{
		int[] listOfIntegers = new int[] {2,6,5,1,9,8,7,3,4};
		
		
		// Sort by smallest to largest
//		for (int i = 0; i < listOfIntegers.length; i++)
//		{
//			for (int n = 0; n < listOfIntegers.length; n++) {
//				if (listOfIntegers[i] < listOfIntegers[n]) {
//					// Swap
//					int temp = listOfIntegers[i];
//					listOfIntegers[i] = listOfIntegers[n];
//					listOfIntegers[n] = temp;
//				}
//			}
//		}
		
		// Sort by largest to smallest
		for (int i = 0; i < listOfIntegers.length; i++)
		{
			for (int n = 0; n < listOfIntegers.length; n++) {
				if (listOfIntegers[i] > listOfIntegers[n]) {
					// Swap
					int temp = listOfIntegers[i];
					listOfIntegers[i] = listOfIntegers[n];
					listOfIntegers[n] = temp;
				}
			}
		}
		
		// Output list of sorted integers
		SortingAnArray sortingArrayObject = new SortingAnArray();
		String output = sortingArrayObject.outputArray(listOfIntegers);
		
		System.out.println(output);
	}
	
	public String outputArray (int[] items)
	{
		String output = "";
		for (int i = 0; i < items.length; i++) {
			output = output + items[i];
			
			if (i < items.length - 1) {
				output = output + ", ";
			}
		}
		
		return output;
	}
}
