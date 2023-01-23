public class Solution {

	public static int minCount(int n) {
		if (n == 0)
			return 0;
		int[] dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			int minAns = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				int ans = 1 + dp[i - (j * j)];
				if (ans < minAns)
					minAns = ans;
			}
			dp[i] = minAns;
		}
		return dp[n];
	}
}