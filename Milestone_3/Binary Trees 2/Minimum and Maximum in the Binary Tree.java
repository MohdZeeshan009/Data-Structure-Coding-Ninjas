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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

   public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root,Pair<Integer,Integer> pair) {
		//Your code goes here
		  if (root==null) return pair;
        if (root.data<pair.minimum) pair.minimum=root.data;
        if (root.data>pair.maximum) pair.maximum=root.data;
        getMinAndMax(root.left,pair);
        getMinAndMax(root.right,pair);
        return pair;
    }
    
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        return getMinAndMax(root,new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE));
    
	}
	
}