
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int n = s.length();
		int m =t.length();
		int dp[][] = new int[s.length() + 1][t.length() + 1];

		int myAns, ans1, ans2;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (s.charAt(i) == t.charAt(j)) {
					myAns = 1 + dp[i + 1][j + 1];
				} else {
					ans1 = dp[i][j + 1];
					ans2 = dp[i + 1][j];
					myAns = Math.max(ans1, ans2);
				}
				dp[i][j] = myAns;

			}
		}
		return dp[0][0];
    }

}