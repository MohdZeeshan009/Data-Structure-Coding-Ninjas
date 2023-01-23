import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if (root==null) return null;
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        ArrayList<LinkedListNode<Integer>> arrayList = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        LinkedListNode<Integer> head = new LinkedListNode<>(-1),tail = head;
        while (!queue.isEmpty()){
            if (queue.peek()==null){
                arrayList.add(head.next);
                queue.add(queue.poll());
                if (queue.peek()==null) return arrayList;
                head = new LinkedListNode<>(-1);
                tail = head;
                continue;
            }
            if (queue.peek().left!=null) queue.add(queue.peek().left);
            if (queue.peek().right!=null) queue.add(queue.peek().right);
            tail.next = new LinkedListNode<>(queue.peek().data);
            tail = tail.next;
            queue.poll();
        }
        return arrayList;
    }

}