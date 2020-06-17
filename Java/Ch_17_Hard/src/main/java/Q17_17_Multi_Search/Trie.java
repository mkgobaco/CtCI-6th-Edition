<<<<<<< HEAD:Java/Ch_17_Hard/src/main/java/Q17_17_Multi_Search/Trie.java
package Q17_17_Multi_Search;

import java.util.ArrayList;

public class Trie {
	private TrieNode root = new TrieNode();
	
	public Trie(String s) {
		insertString(s, 0);
	}
	
	public Trie() {
		
	}
	
	public ArrayList<Integer> search(String s) {
		return root.search(s);
	}
	
	public void insertString(String str, int location) {
		root.insertString(str, location);
	}
	
	public TrieNode getRoot() {
		return root;
	}
}
=======
package Q17_17_Multi_Search;

import java.util.ArrayList;

public class Trie {
	private TrieNode root = new TrieNode();
	
	public ArrayList<Integer> search(String s) {
		return root.search(s);
	}
	
	public void insertString(String str, int location) {
		root.insertString(str, location);
	}
	
	public TrieNode getRoot() {
		return root;
	}
}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 17. Hard/Q17_17_Multi_Search/Trie.java
