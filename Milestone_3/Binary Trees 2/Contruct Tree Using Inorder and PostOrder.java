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

	public static BinaryTreeNode<Integer> ConstTreeHelper(int [] in, int [] post, int siIn, int eiIn, int siPost, int eiPost){
		if(siPost>eiPost) {
			return null;
		}
		int rootData=post[eiPost];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		
		int rootIndex=-1;
		for(int i=siIn; i<=eiIn;i++) {
			if(in[i]==rootData) {
				rootIndex=i;
				break;
			}
		}
		
		int siInLeft=siIn;
		int siPostLeft=siPost;
		
		int eiInLeft=rootIndex-1;
		
		
		int siInRight=rootIndex+1;
		
		
		int eiInRight=eiIn;
		int eiPostRight=eiPost-1;
		
		int leftSubTreeLenght=eiInLeft-siInLeft+1;
		int eiPostLeft=siPostLeft+leftSubTreeLenght-1;
		int siPostRight=eiPostLeft+1;
		
		BinaryTreeNode<Integer> left=ConstTreeHelper(in, post, siInLeft, eiInLeft, siPostLeft, eiPostLeft);
		BinaryTreeNode<Integer> right=ConstTreeHelper(in, post, siInRight, eiInRight, siPostRight, eiPostRight);
		
		root.left=left;
		root.right=right;
		return root;
		
	}

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
		BinaryTreeNode<Integer> root=ConstTreeHelper(inOrder, postOrder, 0, inOrder.length-1, 0, postOrder.length-1);
		return root;

	}

}