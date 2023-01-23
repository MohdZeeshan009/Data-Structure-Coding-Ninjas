import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
		 int[] arr = new int[price.length];
        Stack<Integer> helper = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        for (int i:price) stack.push(i);

        for (int i=price.length-1;i>=0;i--){
            int count = 1;
            int num = stack.peek();
            stack.pop();
            while (!stack.isEmpty() && stack.peek()<num){
                count++;
                helper.push(stack.pop());
            }
            arr[i] = count;
            while (!helper.isEmpty()){
                stack.push(helper.pop());
            }
        }
        return arr;
	}

}