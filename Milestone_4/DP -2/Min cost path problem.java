
public class Solution {

	public static int minCostPath(int[][] input) {
		//Your code goes here
		int n=input.length;
		int m=input[0].length;

		int dp	[][]=new int [n+1][m+1];
		for(int i=0; i<dp.length;i++) {
			for(int j=0; j<dp[i].length;j++) {
				dp[i][j]=Integer.MAX_VALUE;
			}	
		}
		int ans1, ans2, ans3;
		for(int i=n-1; i>=0; i--) {
			for(int j=m-1; j>=0; j--) {
				if(i==n-1 && j==m-1) {
					dp[i][j]=input[i][j];
					continue;
				}
				ans1=dp[i][j+1];
				ans2=dp[i+1][j];
				ans3=dp[i+1][j+1];
				dp[i][j]=input[i][j]+Math.min(ans1, Math.min(ans2, ans3));
				
				
			}
		}
		return dp[0][0];
	}
}