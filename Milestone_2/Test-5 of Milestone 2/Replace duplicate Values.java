import java.util.HashMap;
import java.util.Map;

public class solution {

    public static void changeLL(LinkedListNode<Integer> head) {
        // Write your code here
        Map<Integer, Integer> mymap = new HashMap<>();

        LinkedListNode<Integer> temp = head;

        // variable to store the maximum number
        // in linked list
        int maxNum = 0;

        // traverse the linked list to store
        // the frequency of every number and
        // find the maximum integer
        while (temp != null)
        {
            mymap.put(temp.data,(mymap.get(temp.data) ==
                    null?0:mymap.get(temp.data))+1);
            if (maxNum < temp.data)
                maxNum = temp.data;
            temp = temp.next;
        }

        // Traverse again the linked list
        while (head != null)
        {

            // Mark the node with frequency more
            // than 1 so that we can change the
            // 2nd occurrence of that number
            if (mymap.get(head.data) > 1)
                mymap.put(head.data, -1);

                // -1 means number has occurred
                // before change its value
            else if (mymap.get(head.data) == -1)
                head.data = ++maxNum;

            head = head.next;
        }

    }
}