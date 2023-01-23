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

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here

        if (preOrder.length == 0) return null;
        int length = preOrder.length, rootData = preOrder[0], i;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(rootData);
        for (i = 0; i < length; i++) if (rootData == inOrder[i]) break;

        int[] leftPreOrder = new int[i], leftInOrder = new int[i];
        System.arraycopy(preOrder, 1, leftPreOrder, 0, i);
        System.arraycopy(inOrder, 0, leftInOrder, 0, i);
        node.left = buildTree(leftPreOrder, leftInOrder);

        int[] rightPreOrder = new int[length - i - 1], rightInOrder = new int[length - i - 1];
        System.arraycopy(preOrder, i + 1, rightPreOrder, 0, length - i - 1);
        System.arraycopy(inOrder, i + 1, rightInOrder, 0, length - i - 1);
        node.right = buildTree(rightPreOrder, rightInOrder);

        return node;
    
	}

}