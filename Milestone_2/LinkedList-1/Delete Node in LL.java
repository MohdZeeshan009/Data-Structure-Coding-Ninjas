/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
		if(head==null){
            return head;
        }
        if (head.next==null) return null;
        if (pos == 0){
            head = head.next;
            return head;
        }
        LinkedListNode<Integer> tempHead = head;
        for (int i=0;i<pos-1;i++){
            if (tempHead.next.next==null) return head;
            tempHead = tempHead.next;
        }
        tempHead.next = tempHead.next.next;
        return head;
	}
}
