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

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
		 if (head == null) return;
        for (int j=0;j<i;j++) {
            if (head == null) return;
            head = head.next;
            
        }
        System.out.println(head.data);
    
	}
}