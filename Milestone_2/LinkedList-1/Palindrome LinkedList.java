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

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        //Your code goes here
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head!=null){
            arrayList.add(head.data);
            head=head.next;
        }
        int j = arrayList.size()-1;
        for (int i=0;i<arrayList.size()/2;i++){
            if (!arrayList.get(i).equals(arrayList.get(j))){
                return false;
            }
            j--;
        }
        return true;
    }

}