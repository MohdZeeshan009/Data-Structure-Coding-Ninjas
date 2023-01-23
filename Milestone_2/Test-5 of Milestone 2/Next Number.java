public class Solution {


    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> last = null;
        LinkedListNode<Integer> cur = head;

        // Iterate till the last node
        while (cur.next != null) {
            if (cur.data != 9) {
                last = cur;
            }
            cur = cur.next;
        }

        // If last node is not equal to 9
        // add 1 to it and return the head
        if (cur.data != 9) {
            cur.data++;
            return head;
        }

        // If list is of the type 9 . 9 . 9 ...
        if (last == null) {
            last = new LinkedListNode<>(0);
            last.next = head;
            head = last;
        }

        // For cases when the rightmost node which
        // is not equal to 9 is not the last
        // node in the linked list
        last.data++;
        last = last.next;

        while (last != null) {
            last.data = 0;
            last = last.next;
        }
        return head;
    }
}