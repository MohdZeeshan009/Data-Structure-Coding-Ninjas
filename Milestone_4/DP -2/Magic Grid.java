import java.util.Arrays;

public class Solution {

    public static int getMinimumStrength(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] i : dp) Arrays.fill(i, Integer.MAX_VALUE);
        dp[grid.length - 1][grid[0].length - 1] = 1;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (dp[i][j] == Integer.MAX_VALUE) {
                    int ans1 = Integer.MAX_VALUE, ans2 = Integer.MAX_VALUE;
                    if (i + 1 < grid.length) ans1 = dp[i + 1][j] - grid[i + 1][j];
                    if (j + 1 < grid[0].length) ans2 = dp[i][j + 1] - grid[i][j + 1];
                    int ans = Math.min(ans1, ans2);
                    if (ans <= 0) dp[i][j] = 1;
                    else dp[i][j] = ans;
                }
            }
        }
        return dp[0][0];
    }
}