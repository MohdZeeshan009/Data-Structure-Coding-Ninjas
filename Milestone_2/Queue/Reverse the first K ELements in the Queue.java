import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input) {
		//Your code goes here
        if(input.size()==0){
            return input;
        }
        int temp=input.peek();
        input.poll();
        
        reverseKElements(input);
        input.add(temp);
        return input;
        
	}
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k){
        
        Queue<Integer> queue= new LinkedList<Integer>();
        for(int i=0;i<k;i++) queue.add(input.poll());
        reverseKElements(queue);
        while(input.size()!=0) queue.add(input.poll());
        return queue;
    }
}