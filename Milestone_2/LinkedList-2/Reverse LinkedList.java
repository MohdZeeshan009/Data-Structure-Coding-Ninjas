/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head == null ) return null;
        if (head.next==null) {
            return head;
        }
        LinkedListNode<Integer> node = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next=null;
        return node;
    }

}