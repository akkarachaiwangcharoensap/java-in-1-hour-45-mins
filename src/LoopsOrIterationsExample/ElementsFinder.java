package LoopsOrIterationsExample;

public class ElementsFinder {
	public static void main (String[] args) {
		
		int target = 4;
		int[] listOfIntegers = new int[] { 2,4,125,-12602,123123,4,-123,12412,5, 4 };
		
		for (int i = 0; i < listOfIntegers.length; i++) {
			if (listOfIntegers[i] == target) {
				System.out.println (target + " found at index: " + i);
			}
		}
	}
}
