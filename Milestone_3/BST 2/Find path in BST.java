import java.util.ArrayList;

public class Solution {

    public static boolean searchInBinaryTree(BinaryTreeNode<Integer> root,int x){
        if (root == null) return false;
        if (root.data==x) return true;
        return searchInBinaryTree(root.left,x) || searchInBinaryTree(root.right,x);
    }

    public static void getPath(BinaryTreeNode<Integer> root,int data,ArrayList<Integer> arrayList){
        if (root==null) return;
        if (!searchInBinaryTree(root,data)) return;
        arrayList.add(0,root.data);
        getPath(root.left,data,arrayList);
        getPath(root.right,data,arrayList);
    }

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        ArrayList<Integer> arrayList = new ArrayList<>();
        getPath(root,data,arrayList);
        return arrayList;
    }
}