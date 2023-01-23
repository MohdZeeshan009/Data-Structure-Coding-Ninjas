public class Queue {

    //Define the data members
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        //Implement the Constructor
        front = null;
        rear = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }


    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        Node node = new Node(data);
        if (front == null || rear == null) {
            front = node;
            rear = node;
            size = 1;
            return;
        }
        rear.next = node;
        rear = rear.next;
        size++;
    }


    public int dequeue() {
        //Implement the dequeue() function
        if (front==null) return -1;
        int data = front.data;
        front = front.next;
        size--;
        return data;
    }


    public int front() {
        //Implement the front() function
        if (front==null) return -1;
        return front.data;
    }
}