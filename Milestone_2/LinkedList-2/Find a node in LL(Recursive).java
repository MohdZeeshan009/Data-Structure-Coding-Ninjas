public class Solution {
    public static int findNodeRec(LinkedListNode<Integer> head, int n,int count) {
        //Your code goes here
        if (head==null) return -1;
        if (head.data == n) return count;
        return findNodeRec(head.next,n,++count);
    }
    public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        return findNodeRec(head,n,0);
    }
}