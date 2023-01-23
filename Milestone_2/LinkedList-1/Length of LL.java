/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/


		public class Solution {

	public static int length(LinkedListNode<Integer> head) {
        //Your code goes here
        int count = 0;
        while (head != null && head.data != -1 ) {
            count++;
            head = head.next;
        }
        return count;
    
	}
}