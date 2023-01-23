import java.util.Stack;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		 Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == ')') {
                while (stack.peek()!='(') {
                    stack.pop();
                    count++;
                }
                stack.pop();
                if (count<=1) return true;
                count = 0;
            }else stack.push(expression.charAt(i));
        }
        return false;
	}
}