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
	public static void replaceWithDepthValueHelper(TreeNode<Integer> root, int depth) {
		
		root.data=depth;
		for(int i=0; i<root.children.size(); i++) {
			replaceWithDepthValueHelper(root.children.get(i), depth+1);
		}
		
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root) {
		
		replaceWithDepthValueHelper(root, 0);
	
		
	}
	
	
}
