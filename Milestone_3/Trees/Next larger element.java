
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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
	 if(root==null)
    return root;

    if(root.children.size()==0)
    {
        if(root.data>n)
        {
            return root;
        }

        else
        return null;

    }

    TreeNode<Integer> count[] = new TreeNode[root.children.size()];

    for(int i=0;i<root.children.size();i++)
    {
        count[i] = findNextLargerNode(root.children.get(i),n);
    }

    int nextLarger=Integer.MAX_VALUE;
    TreeNode<Integer> next = null;


    for(int i=0;i<count.length;i++)
    {
        if(count[i]!=null)
        {
            if(count[i].data>n && count[i].data<nextLarger)
            {
                nextLarger = count[i].data;
                next = count[i];
            }
        }
    }

   if(next!=null)
    {
        if(root.data>n && root.data<next.data)
        return root;
        else
        return next;

    }
    else 
    {
        if(root.data>n)
        return root;
        else 
        return null;
    }

	}
}
