public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
		if(root==null)return false;
		
		if(root.data==x) return true;
		
		
		for(TreeNode<Integer> i: root.children) {
			if(checkIfContainsX(i, x)) {
				return true;
			}
		}
		return false;
	}
	
}
