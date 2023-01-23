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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here

	 int size1=root1.children.size();
    int size2=root2.children.size();
    if(root1==null && root2==null){
        return true;
    }
    if((root1==null && root2!=null) || (root1!=null && root2==null)){
        return false;
    }
    if((root1.data!=root2.data)||(size1!=size2)){
        return false;
    }
    
    if(size1==size2){
        if(root1.data==root2.data){
            for(int i =0;i<size1;i++){
             for(int j=0;j<size2;j++){
                 TreeNode<Integer> child1=root1.children.get(i);
                 TreeNode<Integer> child2=root2.children.get(i);
                 if(!checkIdentical(child1,child2)){
                     return false;
                 }
             }   
            }
        }
    }
    return true;
	}
}
