public class Solution {

    public static boolean isBST(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
        if (root == null) return true;
        if (root.data < minRange || root.data > maxRange) return false;
        return isBST(root.left, minRange, root.data - 1) && isBST(root.right, root.data, maxRange);
    }

    public static boolean isBST(BinaryTreeNode<Integer> root){
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static int findBSTHeight(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        return 1 + Math.max(findBSTHeight(root.left), findBSTHeight(root.right));
    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root){
        if (root==null) return 0;
        if (isBST(root)) return findBSTHeight(root);
        return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
    }

}