
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

	  public static void printNodeAtDepthK(BinaryTreeNode<Integer> root, int depth) {
        if (root == null) return;
        if (depth == 0) {
            System.out.println(root.data);
            return;
        }
        printNodeAtDepthK(root.left, depth - 1);
        printNodeAtDepthK(root.right, depth - 1);
    }

    public static int print(BinaryTreeNode<Integer> root, int node, int k) {
        if (root == null) 
            return -1;
        if (root.data == node) {
            printNodeAtDepthK(root, k);
            return 0;
        }
        int leftDistance = print(root.left, node, k);
        if (leftDistance != -1) {
            if (leftDistance + 1 == k) 
                printNodeAtDepthK(root, 0);
                // {System.out.print(root.data+" ");
                //   System.out.println();}
            else 
                printNodeAtDepthK(root.right, k - leftDistance - 2);
            return leftDistance+1;
        }

        int rightDistance = print(root.right, node, k);
        if (rightDistance != -1) {
            if (rightDistance + 1 == k) 
                printNodeAtDepthK(root, 0);
                 // {System.out.print(root.data+" ");
                 //   System.out.println();}
            else printNodeAtDepthK(root.left, k - rightDistance - 2);
            return rightDistance+1;
        }
        return -1;
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        print(root, node, k);
	}

}