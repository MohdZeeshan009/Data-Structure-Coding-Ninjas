import java.util.LinkedList;
import java.util.*;

public class Stack {

    // Define the data members
    Queue<Integer> s1, s2;

    public Stack() {
        // Implement the Constructor
        s1 = new LinkedList<Integer>();
        s2 = new LinkedList<Integer>();
    }

    // ----------------- Public Functions of Stack -----------------/

    public int getSize() {
        // Implement the getSize() function
        return s1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function
        return s1.size() == 0;
    }

    public void push(int element) {
        // Implement the push(element) function
        s1.add(element);

    }

    public int pop() {
        // Implement the pop() function
        int temp = -1;
        if (s1.isEmpty())
            return -1;
        while (!s1.isEmpty()) {
            if (s1.size() == 1)
                temp = s1.peek();
            else {
                s2.add(s1.peek());
            }
            s1.poll();
        }
        while (!s2.isEmpty()) {
            s1.add(s2.peek());
            s2.poll();
        }
        return temp;

    }

    public int top() {
        // Implement the top() function
        int temp = -1;
        if (s1.isEmpty()) {
            return -1;
        }
        while (!s1.isEmpty()) {
            if (s1.size() == 1) {
                temp = s1.peek();
                s2.add(s1.peek());
            } else {
                s2.add(s1.peek());
            }
            s1.poll();
        }
        while (!s2.isEmpty()) {
            s1.add(s2.peek());
            s2.poll();
        }
        return temp;
    }
}