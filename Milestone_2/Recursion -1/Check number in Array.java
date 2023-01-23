import java.util.Arrays;
public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		int n=input.length-1;
		if(input[0]==x||input[n]==x) {
			return true;
		}
		else if(n==0) {
			return false;
			
		}
		else {
			return checkNumber(Arrays.copyOfRange(input, 0, n), x);
		}
		
	}
}