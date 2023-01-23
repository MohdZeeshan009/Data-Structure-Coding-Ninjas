public class Solution {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
		int dp[]=new int [n+1];
		dp[0]=1;
		for(int i=2; i<=n;i++) {
			int ans1=dp[i-1];
			if(i%2==0) {
				ans1=Math.min(ans1, dp[i/2]);
			}
			if(i%3==0) {
				ans1=Math.min(ans1, dp[i/3]);
			}
			dp[i]=1+ans1;
		
		}
		
		return dp[n];
	}

}