<<<<<<< HEAD:Java/Ch_01_Arrays_and_Strings/src/main/java/Q1_02_Check_Permutation/QuestionB.java
package Q1_02_Check_Permutation;

public class QuestionB {	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		 
		char[] s_array = s.toCharArray();
		for (char c : s_array) { // count number of each char in s.
			letters[c]++;  
		}
		  
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
		    if (letters[c] < 0) {
		    	return false;
		    }
		}
		  
		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
=======
package Q1_02_Check_Permutation;

public class QuestionB {	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) return false; // Permutations must be same length
		
		int[] letters = new int[128]; // Assumption: ASCII
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		  
		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
		    if (letters[t.charAt(i)] < 0) {
		    	return false;
		    }
		}
		  
		return true; // letters array has no negative values, and therefore no positive values either
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 01. Arrays and Strings/Q1_02_Check_Permutation/QuestionB.java
