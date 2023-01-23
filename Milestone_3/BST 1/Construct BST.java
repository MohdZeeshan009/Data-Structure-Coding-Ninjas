public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			if(n==0) {
			return null;
		}
		if(n==1) {
			return new BinaryTreeNode<Integer>(arr[0]);
		}
		int rootPos;
		if(n%2==0) {
			rootPos=n/2-1;
		}
		else {
			rootPos=n/2;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(arr[rootPos]);
		int []leftChild=new int [rootPos];
		System.arraycopy(arr, 0, leftChild, 0, rootPos);
		root.left=SortedArrayToBST(leftChild, rootPos);
		int []rightChild=new int [n-rootPos-1];
		System.arraycopy(arr, rootPos+1, rightChild, 0, n-rootPos-1);
		root.right=SortedArrayToBST(rightChild	, n-rootPos-1);
		return root;
			
		}
	}