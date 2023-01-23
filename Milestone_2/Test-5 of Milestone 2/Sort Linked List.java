public class Solution {

	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> slow,LinkedListNode<Integer> fast){
        //Your code goes here
        if (slow==null) return null;
        if (fast.next == null || fast.next.next==null) return slow;
        return midPoint(slow.next,fast.next.next);
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        return midPoint(head,head);
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> A, LinkedListNode<Integer> B) {
        //Your code goes here
        if(A == null) return B;
        if(B == null) return A;

        if(A.data < B.data)
        {
            A.next = mergeTwoSortedLinkedLists(A.next, B);
            return A;
        }
        else
        {
            B.next = mergeTwoSortedLinkedLists(A, B.next);
            return B;
        }
    }

    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head==null || head.next == null) return head;
        LinkedListNode<Integer> midPoint = midPoint(head);
        LinkedListNode<Integer> part1 = sort(midPoint.next);
        midPoint.next = null;
        LinkedListNode<Integer> part2 = sort(head);
        return mergeTwoSortedLinkedLists(part1,part2);
    }

}