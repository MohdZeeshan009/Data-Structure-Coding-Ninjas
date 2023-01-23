import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		while (!input.isEmpty()) {
            extra.push(input.pop());
        }
        while (!extra.isEmpty()){
            System.out.print(extra.pop()+" ");
        }
	}
}