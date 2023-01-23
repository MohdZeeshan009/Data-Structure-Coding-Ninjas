

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class Stack {

    //Define the data members
    Node node;
    int size;


    public Stack() {
        node = null;
        size = 0;
        //Implement the Constructor
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return size;
        //Implement the getSize() function
    }

    public boolean isEmpty() {
        return size == 0;
        //Implement the isEmpty() function
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = node;
        size++;
        node = newNode;
        //Implement the push(element) function
    }

    public int pop() {
        if (node == null) return -1;
        int data = node.data;
        node = node.next;
        size--;
        return data;
        //Implement the pop() function
    }

    public int top() {
        if (node == null) return -1;
        return node.data;
        //Implement the top() function
    }
}


public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack stack = new Stack();
        for (int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if (c == '{'|| c=='[' || c=='(') {
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;
                if (c=='{' && stack.top()!='}' ||c=='[' && stack.top()!=']'||c=='(' && stack.top()!=')'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}