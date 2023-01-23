public class Solution {

	public static int smallestSuperSequence(String str1, String str2, int i, int j, int[][] dp) {

		if (i == str1.length())
			return str2.length() - j;
		if (j == str2.length())
			return str1.length() - i;
		if (str1.charAt(i) == str2.charAt(j)) {
			int ans1;
			if (dp[i][j] == -1) {
				ans1 = 1 + smallestSuperSequence(str1, str2, i + 1, j + 1, dp);
				dp[i][j] = ans1;
			} else
				ans1 = dp[i][j];
			return ans1;
		} else {
			int ans2, ans3;
			if (dp[i + 1][j] == -1) {
				ans2 = smallestSuperSequence(str1, str2, i + 1, j, dp);
				dp[i + 1][j] = ans2;
			} else
				ans2 = dp[i + 1][j];
			if (dp[i][j + 1] == -1) {
				ans3 = smallestSuperSequence(str1, str2, i, j + 1, dp);
				dp[i][j + 1] = ans3;
			} else
				ans3 = dp[i][j + 1];
			dp[i][j] = 1 + Math.min(ans2, ans3);
			return dp[i][j];
		}

	}

	public static int smallestSuperSequence(String str1, String str2) {
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		return smallestSuperSequence(str1, str2, 0, 0, dp);
	}
}