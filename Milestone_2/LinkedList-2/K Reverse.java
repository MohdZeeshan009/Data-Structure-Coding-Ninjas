public class Solution {

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head == null) return null;
        if (head.next == null) {
            return head;
        }
        LinkedListNode<Integer> node = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        //Your code goes here
        if(head == null) return null;
        if(head.next == null || k==1) return head;
        LinkedListNode<Integer> temp = head;
        for (int i = 0; i < k-1; i++) {
            temp = temp.next;
            if (temp.next == null) {
                return reverseLinkedListRec(head);
            } 
        }
        LinkedListNode<Integer> next = kReverse(temp.next, k);
        temp.next = null;
        LinkedListNode<Integer> reverse = reverseLinkedListRec(head);
        head.next = next;
        return reverse;
    }
} 