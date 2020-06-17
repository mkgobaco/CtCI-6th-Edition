<<<<<<< HEAD:Java/Ch_10_Sorting_and_Searching/src/main/java/Q10_02_Group_Anagrams/AnagramComparator.java
package Q10_02_Group_Anagrams;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
	public String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
    public int compare(String s1, String s2) {
    	return sortChars(s1).compareTo(sortChars(s2));
    }
}
=======
package Q10_02_Group_Anagrams;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
	private String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
    public int compare(String s1, String s2) {
    	return sortChars(s1).compareTo(sortChars(s2));
    }
}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 10. Sorting and Searching/Q10_02_Group_Anagrams/AnagramComparator.java
