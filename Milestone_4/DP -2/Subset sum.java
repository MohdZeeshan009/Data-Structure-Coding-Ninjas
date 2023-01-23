import java.util.Arrays;

public class Solution {

    static boolean isSubsetPresent(int[] arr, int n, int sum, int[][] dp) {
        if (sum == 0) return true;
        if (n == -1) return false;
        boolean ans1 = false, ans2 = false;
        if (n - 1 >= 0 && sum - arr[n] >= 0) {
            if (dp[n - 1][sum - arr[n]] == -1) {
                ans1 = isSubsetPresent(arr, n - 1, sum - arr[n], dp);
                if (ans1) dp[n - 1][sum - arr[n]] = 1;
                else dp[n - 1][sum - arr[n]] = 0;
            } else if (dp[n - 1][sum - arr[n]] == 1) ans1 = true;
        }
        if (n - 1 >= 0) {
            if (dp[n - 1][sum] == -1) {
                ans2 = isSubsetPresent(arr, n - 1, sum, dp);
                if (ans2) dp[n - 1][sum] = 1;
                else dp[n - 1][sum] = 0;
            } else if (dp[n - 1][sum] == 1) ans2 = true;
        }
        if (ans1 || ans2) dp[n][sum] = 1;
        else dp[n][sum] = 0;
        return ans1 || ans2;
    }

    static boolean isSubsetPresent(int[] arr, int n, int sum) {
        int[][] dp = new int[n][sum + 1];
        for (int i = 0; i < arr.length; i++) Arrays.fill(dp[i], -1);
        return isSubsetPresent(arr, n - 1, sum, dp);
    }
}