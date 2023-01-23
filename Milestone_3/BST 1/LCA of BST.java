public class Solution {
    
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if (root==null) return false;
        if (k==root.data) return true;
        if (k<root.data) return searchInBST(root.left,k);
        else return searchInBST(root.right,k);
    }

    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null) return -1;
        if (searchInBST(root.left,a) && searchInBST(root.left,b)){
            return getLCA(root.left,a,b);
        }else if (searchInBST(root.right,a) && searchInBST(root.right,b)){
            return getLCA(root.right,a,b);
        }else return root.data;
    }
}