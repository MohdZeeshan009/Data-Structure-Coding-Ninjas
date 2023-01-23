
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static int sumOfAllNode(TreeNode<Integer> root){
	if(root==null)return 0;
		int sum=root.data;
		for(TreeNode<Integer> i : root.children){
			sum+=sumOfAllNode(i);
		}
		return sum;

	}
}
