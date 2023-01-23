public class Solution {

    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        //Your code goes here
        if (M==0|| head==null) return null;
        LinkedListNode<Integer> temp = head;
        while (temp.next != null) {
            for (int i = 0; i < M; i++) {
                if (head == temp) {
                    temp = temp.next;
                    i++;
                    continue;
                }
                if (temp == null) return head;
                temp = temp.next;
            }
            for (int i = 0; i < N; i++) {
                if (temp == null || temp.next == null) return head;
                temp.next = temp.next.next;
            }
        }
        return head;
    }
} 