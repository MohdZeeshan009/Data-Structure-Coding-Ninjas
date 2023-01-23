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

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {
			return;
		}
		
		Integer data=root.data;
		BinaryTreeNode<Integer> nodes=new BinaryTreeNode<Integer>(data);
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		nodes.left=root.left;
		root.left=nodes;
	}
	
}