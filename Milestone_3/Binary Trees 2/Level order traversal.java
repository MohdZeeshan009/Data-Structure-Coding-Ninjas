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
import java.util.LinkedList;
import java.util.Queue;
public class Solution {

	public static void levelOrderHelper(Queue<BinaryTreeNode<Integer>> queue) {
		
		System.out.println(queue.peek().data+" ");
		
		while(!queue.isEmpty()) {
			if(queue.peek()==null) {
				System.out.println();
				queue.add(queue.poll());
				if(queue.peek()==null)return;
				continue;
			}
			if(queue.peek().left!=null) {
				System.out.print(queue.peek().left.data+" ");
				queue.add(queue.peek() .left);
			}
			if(queue.peek().right!=null) {
				queue.add(queue.peek().right);
				System.out.print(queue.peek().right.data+" ");
				
			}
			queue.poll();
		}
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		queue.add(root);
		queue.add(null);
		levelOrderHelper(queue);


		//Your code goes here
	}
	
}