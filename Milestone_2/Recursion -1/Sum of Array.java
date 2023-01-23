public class Solution {

	public static int sum(int input[]) {
		int n=input.length;
		if(n==0) {
			return 0;
		}
		int sum=0;
		for(int i=1; i<n;i++) {
			sum+=input[i];
		}
		
		return input[0]+sum;
		
		
	}
}