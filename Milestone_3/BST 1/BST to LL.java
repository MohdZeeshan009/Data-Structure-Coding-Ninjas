import java.util.ArrayList;

public class Solution {
    
    public static void constructLinkedList(LinkedListNode<Integer> node, ArrayList<Integer> arrayList){
        for (Integer integer : arrayList) {
            node.next = new LinkedListNode<>(integer);
            node = node.next;
        }
    }

    public static void convertTreeToList(BinaryTreeNode<Integer> root, ArrayList<Integer> arrayList){
        if (root==null) return;
        convertTreeToList(root.left,arrayList);
        arrayList.add(root.data);
        convertTreeToList(root.right,arrayList);
    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedListNode<Integer> node = new LinkedListNode<>(-1);
        convertTreeToList(root,arrayList);
        constructLinkedList(node,arrayList);
        return node.next;
    }
}