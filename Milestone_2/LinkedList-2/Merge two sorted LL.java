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
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
       if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head1;
		}
		LinkedListNode<Integer> head=null;
		LinkedListNode<Integer> tail=null;
		
		if(head2.data>=head1.data) {
			head=head1;
			tail=head1;
			head1=head1.next;
		}
		else {
			head=head2;
			tail=head2;
			head2=head2.next;
		}
		while(head1!=null && head2!=null) {
			if(head2.data>=head1.data) {
				tail.next=head1;
				tail=head1;
				head1=head1.next;
			}
			else {
				tail.next=head2;
				tail=head2;
				head2=head2.next;
			}
			if(head1!=null) {
				tail.next=head1;
			}
			else {
				tail.next=head2;
			}
		}return head;
    }

}