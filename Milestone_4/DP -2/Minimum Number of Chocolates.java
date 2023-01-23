public class Solution {

	public static int getMin(int[] arr, int N) {
		int[] dp = new int[N];
		boolean first = true;
		for (int i = 0; i < N - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				if (first) {
					dp[i] = 1;
					first = false;
				}
				dp[i + 1] = dp[i] + 1;
			} else
				first = true;
		}
		first = true;
		for (int i = N - 1; i > 0; i--) {
			if (arr[i] < arr[i - 1]) {
				if (first) {
					dp[i] = 1;
					first = false;
				}
				if (dp[i - 1] != 0)
					dp[i - 1] = Math.max(dp[i - 1], 1 + dp[i]);
				else
					dp[i - 1] = 1 + dp[i];
			}
		}
		int sum = 0;
		for (int i : dp)
			sum += i;
		return sum;
	}
}