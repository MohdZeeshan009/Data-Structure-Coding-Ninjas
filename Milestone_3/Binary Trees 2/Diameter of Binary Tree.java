/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static int depth(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return 1+ Math.max(depth(root.left), depth(root.right));
	}
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return Math.max(depth(root.left)+depth(root.right)+1,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }

}
