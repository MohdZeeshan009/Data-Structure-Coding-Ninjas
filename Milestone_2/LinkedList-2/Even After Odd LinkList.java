public class Solution {

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> oh = null, ot = null, eh = null, et = null;
        LinkedListNode<Integer> temp = head;
        if (head == null) {
            return null;
        }
        while (temp != null) {
            if (temp.data % 2 != 0) {
                if (oh == null) {
                    oh = temp;
                    ot = temp;
                } else {
                    ot.next = temp;
                    ot = ot.next;
                }
            } else {
                if (eh == null) {
                    eh = temp;
                    et = temp;
                } else {
                    et.next = temp;
                    et = et.next;
                }
            }
            temp = temp.next;
        }
        if (oh != null) {
            ot.next = eh;
        } else
            return head;
        if(eh != null) {
            et.next = null;
        }else return head;
        return oh;


    }
}