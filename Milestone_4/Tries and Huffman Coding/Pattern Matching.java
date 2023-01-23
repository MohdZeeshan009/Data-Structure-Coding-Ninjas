import java.util.ArrayList;

class TrieNode{

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}


public class Trie {

	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	public boolean search(String word){
		return search(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}
	private void addHelper(TrieNode root, String word) {
		
		if(word.length()==0) {
			root.isTerminating=true;
			return;
		}
		int childIdx=word.charAt(0)-'a';
		TrieNode child=root.children[childIdx];
		if(child==null) {
			child=new TrieNode(word.charAt(0));
			root.children[childIdx]=child;
			child.childCount++;
		}
		addHelper(child, word.substring(1));
		
		
		
		
	}
	public void add(String word) {
		addHelper(root, word);
		for(int i=0; i<word.length(); i++) {
			add(word.substring(1));
		}
		
	}


	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
		for(String s: vect) {
			add(s);
		}
		return search(pattern);
		
	}

}