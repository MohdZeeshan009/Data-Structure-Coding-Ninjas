public class Solution {

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int x, int y) {
        //Your code goes here
        if (x == y) return head;

        // Search for x (keep track of prevX and CurrX)
        LinkedListNode<Integer> prevX = null, currX = head;
        int count=0;
        while (currX != null && count<x)
        {
            prevX = currX;
            currX = currX.next;
            count++;
        }
        count =0;
        // Search for y (keep track of prevY and currY)
        LinkedListNode<Integer> prevY = null, currY = head;
        while (currY != null && count<y)
        {
            prevY = currY;
            currY = currY.next;
            count++;
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return head;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;

        // Swap next pointers
        LinkedListNode<Integer> temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
        return head;
    }
}