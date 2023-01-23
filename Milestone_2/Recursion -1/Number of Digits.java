public class Solution {

	public static int count(int n){
		if(n==0) {
			return 0;
		}
		int digits=count(n/10)+1;
		return digits;
	}
}
