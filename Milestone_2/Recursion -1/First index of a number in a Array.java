
public class Solution {
	public static int firstIndex(int input[], int x, int startidx) {
		int n=input.length;
		if(startidx==n) {
			return -1;
		}
			
		else if(input[0]==x||input[startidx]==x) {
			return startidx;
		}
		return firstIndex(input,x, startidx+1);
	}


	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x,0);
		
	}
	
}