
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    Node node;
    int size;

    //Define the data members


    public Stack() {

        node=null;
        size=0;
        //Implement the Constructor
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return size; 
        //Implement the getSize() function
    }

    public boolean isEmpty() {
        return size==0;
        //Implement the isEmpty() function
    }

    public void push(int element) {

        Node newNode=new Node(element);
        newNode.next=node;
        node=newNode;
        size++;
        //Implement the push(element) function
    }

    public int pop() {
        if(node==null)
        return -1;
        int temp=node.data;
        node=node.next;
        size--;
        return temp;

        //Implement the pop() function
    }

    public int top() {
        if(node==null)
        return -1;

        return node.data;
        //Implement the top() function
    }
}