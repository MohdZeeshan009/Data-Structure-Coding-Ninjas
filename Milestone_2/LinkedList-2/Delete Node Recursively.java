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


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        
		if(head==null) {
			return null;
		}
		if(pos==0) {
			head=head.next;
			return head;
		}
		head.next=deleteNodeRec(head.next, pos-1);
		return head;
	
	}

}