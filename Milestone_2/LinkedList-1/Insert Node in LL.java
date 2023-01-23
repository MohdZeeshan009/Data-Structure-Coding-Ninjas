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

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
		 LinkedListNode<Integer> tempNode = new LinkedListNode<>(data);
        if (pos == 0){
            tempNode.next = head;
            return tempNode;
        }
        LinkedListNode<Integer> tempHead = head;
        for (int i=0;i<pos-1;i++){
            if(tempHead.next==null) return head;
            tempHead = tempHead.next;
        }
        tempNode.next = tempHead.next;
        tempHead.next = tempNode;
        return head;
	}
}