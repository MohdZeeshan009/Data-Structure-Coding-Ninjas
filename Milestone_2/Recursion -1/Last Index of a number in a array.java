
public class Solution {
	public static int lastIndex(int input[], int x, int si) {
		if(si == 0) {
			return -1;
		}
		if(input[si]==x) {
			return si;
		}
		return lastIndex(input, x, si-1);
	}

	public static int lastIndex(int input[], int x) {
return lastIndex(input, x,input.length-1);

	}
	
}