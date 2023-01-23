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

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
		 if(head == null) return null;
        if(head.next == null || n==0)
	 	
	  return head;
        LinkedListNode<Integer> temp = head;
        int count =0;
        while (temp.next!=null) {
            count++;
            temp = temp.next;
        }
        n = count -n;
        temp = head;
        for (int i=0;i<n;i++){
            assert temp != null;
            temp = temp.next;
        }
        LinkedListNode<Integer> newHead = temp.next;
        temp.next = null;
        temp = newHead;
        while (temp.next != null) temp = temp.next;
        temp.next = head;
        return newHead;
	}

}