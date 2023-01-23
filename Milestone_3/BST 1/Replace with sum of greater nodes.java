import java.util.ArrayList;


public class Solution {

    public static int getSumGreaterThanX(ArrayList<Integer> arrayList,int x) {
        int sum=0;
        for (Integer integer : arrayList) {
            if (integer >= x) sum += integer;
        }
        return sum;
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root,ArrayList<Integer> arrayList){
        if (root==null) return;
        root.data = getSumGreaterThanX(arrayList,root.data);
        replaceWithLargerNodesSum(root.left,arrayList);
        replaceWithLargerNodesSum(root.right,arrayList);
    }

    public static void convertTreeToList(BinaryTreeNode<Integer> root,ArrayList<Integer> arrayList){
        if (root==null) return;
        convertTreeToList(root.left,arrayList);
        arrayList.add(root.data);
        convertTreeToList(root.right,arrayList);
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        convertTreeToList(root,arrayList);
        replaceWithLargerNodesSum(root,arrayList);
    }
}