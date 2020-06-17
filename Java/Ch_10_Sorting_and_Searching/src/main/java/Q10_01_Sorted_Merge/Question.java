<<<<<<< HEAD:Java/Ch_10_Sorting_and_Searching/src/main/java/Q10_01_Sorted_Merge/Question.java
package Q10_01_Sorted_Merge;

import CtCILibrary.AssortedMethods;

public class Question {


	/** Merges array
	 * @param a first array
	 * @param b second array
	 * @param lastA number of "real" elements in a
	 * @param lastB number of "real" elements in b
	 */
	public static void merge(int[] a, int[] b, int lastA, int lastB) {
		int indexMerged = lastB + lastA - 1; /* Index of last location of merged array */
		int indexA = lastA - 1; /* Index of last element in array b */
		int indexB = lastB - 1; /* Index of last element in array a */
	
		/* Merge a and b, starting from the last element in each */
		while (indexB >= 0) {
			if (indexA >= 0 && a[indexA] > b[indexB]) { /* end of a is bigger than end of b */
				a[indexMerged] = a[indexA]; // copy element
				indexA--; 
			} else {
				a[indexMerged] = b[indexB]; // copy element
				indexB--;
			}
			indexMerged--; // move indices			
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
		int[] b = {1, 4, 7, 6, 7, 7};
		merge(a, b, 8, 6);
		System.out.println(AssortedMethods.arrayToString(a));
	}

}
=======
package Q10_01_Sorted_Merge;

import CtCILibrary.AssortedMethods;

public class Question {


	/** Merges array
	 * @param a first array
	 * @param b second array
	 * @param countA number of "real" elements in a
	 * @param countB number of "real" elements in b
	 */
	public static void merge(int[] a, int[] b, int countA, int countB) {
		int indexMerged = countB + countA - 1; /* Index of last location of merged array */
		int indexA = countA - 1; /* Index of last element in array b */
		int indexB = countB - 1; /* Index of last element in array a */
	
		/* Merge a and b, starting from the last element in each */
		while (indexB >= 0) {
			if (indexA >= 0 && a[indexA] > b[indexB]) { /* end of A is bigger than end of B */
				a[indexMerged] = a[indexA]; // copy element
				indexA--; 
			} else {
				a[indexMerged] = b[indexB]; // copy element
				indexB--;
			}
			indexMerged--; // move indices			
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
		int[] b = {1, 4, 7, 6, 7, 7};
		merge(a, b, 8, 6);
		System.out.println(AssortedMethods.arrayToString(a));
	}

}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 10. Sorting and Searching/Q10_01_Sorted_Merge/Question.java
