import java.util.ArrayList;

public class Solution {

    public static void convertBSTToArrayList(BinaryTreeNode<Integer> root,ArrayList<Integer> arrayList){
        if (root == null) return;
        convertBSTToArrayList(root.left,arrayList);
        arrayList.add(root.data);
        convertBSTToArrayList(root.right,arrayList);
    }

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        convertBSTToArrayList(root,arrayList);
        int i=0,j = arrayList.size()-1;
        while (i<j){
            int pairSum = arrayList.get(i) + arrayList.get(j);
            if (pairSum==s){
                System.out.println(arrayList.get(i++)+" "+arrayList.get(j--));
            }else if (pairSum<s) i++;
            else j--;
        }
    }
}