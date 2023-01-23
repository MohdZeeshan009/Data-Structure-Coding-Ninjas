/*

	Following is the Binary Tree Node class structure.

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

	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
		if(root==null) {
			return 0;
		}
		int sumLeft=getSum(root.left);
		int sumRight=getSum(root.right);
		int sum=root.data+sumLeft+sumRight;
		return sum;
	}

}