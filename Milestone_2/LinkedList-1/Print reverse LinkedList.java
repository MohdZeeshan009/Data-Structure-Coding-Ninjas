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
import java.util.ArrayList;

public class Solution {

    public static void printReverse(LinkedListNode<Integer> root) {
        //Your code goes here
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (root!=null){
            arrayList.add(0,root.data);
            root = root.next;
        }
        for (int i:arrayList){
            System.out.print(i+" ");
        }
    }

}