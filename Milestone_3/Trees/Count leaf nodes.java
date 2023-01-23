public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static int countLeafNodes(TreeNode<Integer> root){

		if(root==null) return 0;
		if(root.children.size()==0) {
			return 1;
		}
		int max=0;
		for(TreeNode<Integer> i : root.children) {
			max+=countLeafNodes(i);
		}
		return max;
	

		// Write your code here

	}
	
}
