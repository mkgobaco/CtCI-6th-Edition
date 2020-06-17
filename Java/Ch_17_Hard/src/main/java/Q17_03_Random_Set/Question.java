<<<<<<< HEAD:Java/Ch_17_Hard/src/main/java/Q17_03_Random_Set/Question.java
package Q17_03_Random_Set;

import CtCILibrary.AssortedMethods;

public class Question {

	/* Random number between lower and higher, inclusive */
	public static int rand(int lower, int higher) { 
		return lower + (int)(Math.random() * (higher - lower + 1));
	}

	/* pick M elements from original array.  Clone original array so that
	 * we don�t destroy the input. */
	public static int[] pickMRandomly(int[] original, int m) {
		for (int i = 0; i < original.length; i++) { 
			int k = rand(0, i);
			int temp = original[k];
			original[k] = original[i];
			original[i] = temp;
		} 
		return original;
	}
	
	public static void main(String[] args) {
		int[] cards = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(AssortedMethods.arrayToString(cards));
		int[] set = pickMRandomly(cards, 4);
		System.out.println(AssortedMethods.arrayToString(set));
	}

}
=======
package Q17_03_Random_Set;

import java.util.Random;

import CtCILibrary.AssortedMethods;

public class Question {

	/* pick M elements from original array.  Clone original array so that
	 * we don�t destroy the input. */
	public static int[] pickMRandomly(int[] original, int m) {
		Random rand = new Random();
		for (int i = 0; i < original.length; i++) { 
			int k = rand.nextInt(i + 1); // Generate random between 0 and i (inclusive)
			int temp = original[k];
			original[k] = original[i];
			original[i] = temp;
		} 
		return original;
	}
	
	public static void main(String[] args) {
		int[] cards = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(AssortedMethods.arrayToString(cards));
		int[] set = pickMRandomly(cards, 4);
		System.out.println(AssortedMethods.arrayToString(set));
	}

}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 17. Hard/Q17_03_Random_Set/Question.java
