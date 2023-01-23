/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
		int count = 0;
        while (head != null) {
            if (head.data == n) return count;
            count++;
            head = head.next;
        }
        return -1;
	}
}