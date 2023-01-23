import java.util.Stack;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
		 if (input.length()%2!=0) return -1;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (!stack.isEmpty() && stack.peek() =='{' && input.charAt(i)=='}')
			stack.pop();
            else stack.push(input.charAt(i));
        }
        int count=0,
		length = stack.size();
        while (!stack.empty() && stack.peek() == '{')
        {
            stack.pop();
            count++;
        }
		return length/2+count%2;
	}

}