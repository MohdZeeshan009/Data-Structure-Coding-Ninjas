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

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
	private boolean searchHelper(TrieNode root, String word, String made) {
		if(word.length()==0) {
			if(root.isTerminating) {
				System.out.println(made);
			}
		
		for(int i=0; i<26; i++) {
			if(root.children[i]!=null) {
				searchHelper(root.children[i],"",  made+root.children[i].data);
				
				}
			}
			return true;
		}
		int childIdx=word.charAt(0)-'a';
		TrieNode child=root.children[childIdx];
		if(child==null) {
			return false;
		}
		return searchHelper(child, word.substring(1), made+word.charAt(0));
	
	}
	 public boolean search(String word) {
        return searchHelper(root, word, "");
	}
	public void autoComplete(ArrayList<String> input, String word) {

		for(String i: input)add(i);
		search(word);

    }

}