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


		//Your code goes here
		public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String str) {
        if (root == null) return;
        if (root.left == null && root.right == null && root.data == k) {
            System.out.println(str + root.data + " ");
        }
        rootToLeafPathsSumToK(root.left, k - root.data, str + root.data + " ");
        rootToLeafPathsSumToK(root.right, k - root.data, str + root.data + " ");
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        rootToLeafPathsSumToK(root, k, "");
    
	}

}